package com.example.demo.repository;

import com.example.demo.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long> {
    List<Employee> findByName(String name);
    List<Employee> findByNameAndLocation(String name, String location);
    List<Employee> findByNameContaining(String keyword);
    //List<Employee> findByNameLike(String "%"+keyword+"%");
    @Query("FROM Employee WHERE name= :name OR location = :location")
    List<Employee> getEmployeeByNameAndLocation(String name, String location);
@Modifying
@Transactional
    @Query("DELETE FROM Employee WHERE name= :name")
    Integer deleteEmployeeByName(String name);
}
