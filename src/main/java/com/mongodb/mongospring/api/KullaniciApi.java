package com.mongodb.mongospring.api;

import com.mongodb.mongospring.entity.Kullanici;
import com.mongodb.mongospring.repository.KullaniciRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import java.util.List;

@RestController
@RequestMapping("/kullanici")
public class KullaniciApi {
    @Autowired
    private KullaniciRepository kullaniciRepository;

    @PostConstruct
    public void init(){
        Kullanici kullanici=new Kullanici();
        kullanici.setAdi("kadir");
        kullanici.setSoyadi("oncel");
        kullaniciRepository.save(kullanici);
    }

    @PostMapping
    public ResponseEntity<Kullanici> ekle(@RequestBody  Kullanici kullanici){
        return ResponseEntity.ok(kullaniciRepository.save(kullanici));
    }

    @GetMapping
    public ResponseEntity<List<Kullanici>> getAllEntity(){
        return ResponseEntity.ok(kullaniciRepository.findAll());
    }
}
