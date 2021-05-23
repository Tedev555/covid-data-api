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
        provinceList.add(new Province("ຜົ້ງສາລີ", 5, 0));
        provinceList.add(new Province("ຫຼວງນໍ້າທາ", 8, 0));
        provinceList.add(new Province("ຫົວພັນ", 0, 0));
        provinceList.add(new Province("ບໍ່ແກ້ວ", 475, 0));
        provinceList.add(new Province("ອຸດົມໄຊ", 14, 0));
        provinceList.add(new Province("ໄຊຍະບູລີ", 3, 0));
        provinceList.add(new Province("ຊຽງຂວາງ", 1, 0));
        provinceList.add(new Province("ຫຼວງພະບາງ", 16, 0));
        provinceList.add(new Province("ວຽງຈັນ", 18, 0));
        provinceList.add(new Province("ນຫລ ວຽງຈັນ", 850, 4));
        provinceList.add(new Province("ບໍລິຄຳໄຊ", 3, 0));
        provinceList.add(new Province("ຄຳມ່ວນ", 6, 5));
        provinceList.add(new Province("ສະຫວັນນະເຂດ", 86, 5));
        provinceList.add(new Province("ສາລະວັນ", 13, 0));
        provinceList.add(new Province("ເຊກອງ", 1, 0));
        provinceList.add(new Province("ອັດຕະປື", 0, 0));
        provinceList.add(new Province("ຈຳປາສັກ", 301, 5));
        provinceList.add(new Province("ໄຊສົມບູນ", 1, 0));

        data.put("newCases", 19);
        data.put("provinces", provinceList);
        data.put("active", 725);
        data.put("death", 2);
        data.put("recovered", 1074);
        data.put("test", 233618);
        return ResponseEntity.ok(data);
    }
}
