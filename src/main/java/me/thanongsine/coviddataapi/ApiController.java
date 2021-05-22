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
        provinceList.add(new Province("ຜົ້ງສາລີ", 10, 0));
        provinceList.add(new Province("ຫຼວງນໍ້າທາ", 10, 0));
        provinceList.add(new Province("ຫົວພັນ", 10, 0));
        provinceList.add(new Province("ບໍ່ແກ້ວ", 10, 0));
        provinceList.add(new Province("ອຸດົມໄຊ", 10, 0));
        provinceList.add(new Province("ໄຊຍະບູລີ", 10, 0));
        provinceList.add(new Province("ຊຽງຂວາງ", 10, 0));
        provinceList.add(new Province("ຫຼວງພະບາງ", 10, 0));
        provinceList.add(new Province("ວຽງຈັນ", 10, 0));
        provinceList.add(new Province("ນຫລ ວຽງຈັນ", 10, 0));
        provinceList.add(new Province("ບໍລິຄຳໄຊ", 10, 0));
        provinceList.add(new Province("ຄຳມ່ວນ", 10, 0));
        provinceList.add(new Province("ສະຫວັນນະເຂດ", 10, 0));
        provinceList.add(new Province("ສາລະວັນ", 10, 0));
        provinceList.add(new Province("ເຊກອງ", 10, 0));
        provinceList.add(new Province("ອັດຕະປື", 10, 0));
        provinceList.add(new Province("ຈຳປາສັກ", 10, 0));
        provinceList.add(new Province("ໄຊສົມບູນ", 10, 0));

        data.put("newCases", 14);
        data.put("provinces", provinceList);
        data.put("active", 961);
        data.put("death", 2);
        data.put("recovered", 800);
        data.put("test", 230610);
        return ResponseEntity.ok(data);
    }
}
