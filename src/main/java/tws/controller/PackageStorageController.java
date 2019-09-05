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

import tws.entity.PackageStorage;
import tws.repository.PackageStorageMapper;

@RestController
@RequestMapping("/packages")
public class PackageStorageController {
    
    @Autowired
    private PackageStorageMapper packageStorageMapper;
    
    @GetMapping
    public ResponseEntity<List<PackageStorage>> getPackages() {
        return ResponseEntity.ok(packageStorageMapper.selectAll());
    }
    
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public PackageStorage insertPackage(@RequestBody PackageStorage packageStorage) {
        packageStorageMapper.insert(packageStorage);
        return packageStorage;
    }

}
