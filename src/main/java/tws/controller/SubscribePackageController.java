package tws.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import tws.entity.SubscribePackage;
import tws.repository.SubscribePackageMapper;

@RestController
@RequestMapping("/subscribePackage")
public class SubscribePackageController {
    
    @Autowired
    private SubscribePackageMapper subscribePackageMapper;
    
    @GetMapping
    public ResponseEntity<List<SubscribePackage>> selectAll(){
        return ResponseEntity.ok(subscribePackageMapper.selectAll());
    }
    
    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public SubscribePackage insertSubscribePackage(@RequestBody SubscribePackage subscribePackage){
        System.out.println("--------------------------------------");
        System.out.println(subscribePackage);
        subscribePackageMapper.insert(subscribePackage);
        return subscribePackage;
    }

}
