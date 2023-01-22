package cn.jxufe.lyl.mapper;

import cn.jxufe.lyl.pojo.Employee;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeMapper {
    List<Employee> getEmployeeList();
}
