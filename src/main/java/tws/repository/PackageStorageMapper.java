package tws.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import tws.entity.PackageStorage;

@Mapper
public interface PackageStorageMapper {
    
    List<PackageStorage> selectAll();
    void insert(@Param("packageStorage") PackageStorage packageStorage);
    
}
