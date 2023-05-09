package com.haydikodlayalim.controller;

import com.haydikodlayalim.dto.KisiDto;
import com.haydikodlayalim.model.ResponseModel;
import com.haydikodlayalim.service.KisiService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/kisi")
@RequiredArgsConstructor
public class KisiController {

    private final KisiService kisiService;
    @PostMapping("/kaydet")
    public KisiDto kaydet(@RequestBody KisiDto kisiDto) {
        if(kisiDto.getAdi() != null && !kisiDto.getAdi().isEmpty()){
           // return ResponseEntity.ok(new ResponseModel( 200, "BAŞARILI"));
            return kisiService.save(kisiDto);
        }else {
          //  return ResponseEntity.badRequest().body(new ResponseModel(400, "adi alanı boş olamaz"));

       return null;
        }
    }

    @GetMapping("/getir")
    public ResponseEntity<List<KisiDto>> tumunuListele() {return ResponseEntity.ok(kisiService.getAll());}
}
