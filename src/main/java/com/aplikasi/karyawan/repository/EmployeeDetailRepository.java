package com.aplikasi.karyawan.repository;

import com.aplikasi.karyawan.entity.DetailEmployee;
import com.aplikasi.karyawan.entity.Employee;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
//public interface EmployeeRepository extends PagingAndSortingRepository<Employee,Long> {
    public interface EmployeeDetailRepository extends JpaRepository<DetailEmployee, Long>, JpaSpecificationExecutor<DetailEmployee> {

    @Query(value = "select c from DetailEmployee c WHERE c.id = :id", nativeQuery = false)
    public DetailEmployee getById(@Param("id") Long id);


}
