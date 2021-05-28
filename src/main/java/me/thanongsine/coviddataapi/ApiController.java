package me.thanongsine.coviddataapi;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Slf4j
@RestController
@RequestMapping(value = "/api/v1")
public class ApiController {

    @GetMapping(value = "/covid-19/laos/cases", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> getCovidCases() {
        Map<String, Object> data = new HashMap<>();
        List<Province> provinceList = new ArrayList<>();
        provinceList.add(new Province("ຜົ້ງສາລີ", 8, 0));
        provinceList.add(new Province("ຫຼວງນໍ້າທາ", 9, 1));
        provinceList.add(new Province("ຫົວພັນ", 0, 0));
        provinceList.add(new Province("ບໍ່ແກ້ວ", 492, 0));
        provinceList.add(new Province("ອຸດົມໄຊ", 22, 0));
        provinceList.add(new Province("ໄຊຍະບູລີ", 3, 0));
        provinceList.add(new Province("ຊຽງຂວາງ", 1, 0));
        provinceList.add(new Province("ຫຼວງພະບາງ", 16, 0));
        provinceList.add(new Province("ວຽງຈັນ", 18, 0));
        provinceList.add(new Province("ນຫລ ວຽງຈັນ", 889, 7));
        provinceList.add(new Province("ບໍລິຄຳໄຊ", 3, 0));
        provinceList.add(new Province("ຄຳມ່ວນ", 6, 0));
        provinceList.add(new Province("ສະຫວັນນະເຂດ", 93, 1));
        provinceList.add(new Province("ສາລະວັນ", 13, 0));
        provinceList.add(new Province("ເຊກອງ", 1, 0));
        provinceList.add(new Province("ອັດຕະປື", 0, 0));
        provinceList.add(new Province("ຈຳປາສັກ", 320, 1));
        provinceList.add(new Province("ໄຊສົມບູນ", 1, 0));


        //Generate news
        List<News> newsList = new ArrayList<>();
        newsList.add(new News("ບ້ານເຂດແດງນະຄອນຫລວງ ວັນທີ 25 ເດືອນ 05", "https://www.facebook.com/CIEH.MoH.Lao/photos/a.1594657613892260/4282103618480966/"));
        newsList.add(new News("ຈຸດສັກວັກຊີນເຂັມ2ຢູ່ນະຄອນຫຼວງວຽງຈັນ", "https://www.facebook.com/CIEH.MoH.Lao/photos/a.1580136645344357/4275377012486960/"));

        data.put("newsList", newsList);
        data.put("totalInfected", 1905);
        data.put("newCases", 10);
        data.put("provinces", provinceList);
        data.put("active", 548);
        data.put("death", 3);
        data.put("recovered", 1355);
        data.put("test", 239985);
        data.put("appVersion", 0.1);
        data.put("updateURL", "https://play.google.com/store/apps/details?id=info.laoscovid19.laocovid19&hl=en&gl=US");
        data.put("infoDate", "28/05/2021");
        return ResponseEntity.ok(data);
    }
}
