package com.csi.dao.test;

import com.csi.dao.EmployeeDaoImpl;
import com.csi.model.Employee;
import com.csi.repo.EmployeeRepo;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.stream.Collectors;
import java.util.stream.Stream;

@SpringBootTest
@RunWith(SpringRunner.class)
public class EmployeeDaoImplTest {

    @Autowired
    EmployeeDaoImpl employeeDaoImpl;

    @MockBean
    EmployeeRepo employeeRepoImpl;

    @Test
    public void saveDataTest(){
        Employee employee = new Employee(121, "SWARA", 45000, 676767767);

        employeeDaoImpl.saveData(employee);

        Mockito.verify(employeeRepoImpl, Mockito.times(1)).save(employee);
    }

    @Test
    public void getAllDataTest(){
        Mockito.when(employeeRepoImpl.findAll()).thenReturn(Stream.of(new Employee(121, "SWARA", 55000, 4545454554L),
                new Employee(111, "MD", 99000, 9898988),
                new Employee(101, "MD", 99000, 9898988)).collect(Collectors.toList()));

        Assert.assertEquals(3, employeeDaoImpl.getAllData().size());
    }

    @Test
    public void deleteDataByIdTest(){
        Employee employee = new Employee(111, "MD", 99000, 9898988);

        employeeDaoImpl.deleteDataById(employee.getEmpId());

        Mockito.verify(employeeRepoImpl, Mockito.times(1)).deleteById(employee.getEmpId());
    }
}
