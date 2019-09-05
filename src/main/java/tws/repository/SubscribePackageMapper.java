package tws.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import tws.entity.SubscribePackage;

@Mapper
public interface SubscribePackageMapper {
    
    List<SubscribePackage> selectAll();
    void insert(@Param("subscribePackage") SubscribePackage subscribePackage);

}
