package com.haydikodlayalim.service.Impl;


import com.google.gson.Gson;
import com.haydikodlayalim.dto.KisiDto;
import com.haydikodlayalim.entitiy.Adres;
import com.haydikodlayalim.entitiy.Kisi;
import com.haydikodlayalim.model.Notification;
import com.haydikodlayalim.producer.NotificationProducer;
import com.haydikodlayalim.repo.AdresRepository;
import com.haydikodlayalim.repo.KisiRepository;
import com.haydikodlayalim.service.KisiService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class KisiServiceImpl implements KisiService {

    @Autowired
    private NotificationProducer notificationProducer;

    private final KisiRepository kisiRepository;
    private final AdresRepository adresRepository;

    @Override
    public KisiDto save(KisiDto kisiDto)  {
        Gson gson = new Gson();
        String json = gson.toJson(kisiDto, KisiDto.class);
        Kisi kisi=new Kisi();
        kisi.setSoyadi(kisiDto.getSoyadi());
//        kisiRepository.save(kisi);
        notificationProducer.sendToQueue(json);

       // Assert.isNull(kisiDto.getAdi(), "Adi alani zorunludur!");
//        Kisi kisi = new Kisi();
//        kisi.setAdi(kisiDto.getAdi());
//        kisi.setSoyadi(kisiDto.getSoyadi());
//        final Kisi kisiDb = kisiRepository.save(kisi);
//        List<Adres> liste = new ArrayList<>();
//        kisiDto.getAdresler().forEach(item ->{
//            Adres adres = new Adres();
//            adres.setAdres(item);
//            adres.setAdresTip(Adres.AdresTip.DIGER);
//            adres.setAktif(true);
//            adres.setKisi(kisiDb);
//            liste.add(adres);
//
//        });
//        adresRepository.saveAll(liste);
//        kisiDto.setId(kisiDb.getId());
        return kisiDto;
    }


    @Override
    public void delete(Long id) {

    }

    @Override
    public List<KisiDto> getAll() {
        List<Kisi> kisiler= kisiRepository.findAll();
        List<KisiDto> kisiDtos= new ArrayList<>();

        kisiler.forEach(it -> {
            KisiDto kisiDto =new KisiDto();
            kisiDto.setId(it.getId());
            kisiDto.setAdi(it.getAdi());
            kisiDto.setSoyadi(it.getSoyadi());
            kisiDto.setAdresler(it.getAdresleri().stream()
                    .map(Adres::getAdres).collect(Collectors.toList()));
            kisiDtos.add(kisiDto);

        });
        return kisiDtos;
    }

    @Override
    public Page<KisiDto> getAll(Pageable pageable) {
        return null;
    }
}
