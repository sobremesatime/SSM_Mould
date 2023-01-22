package cn.jxufe.lyl.service;

import cn.jxufe.lyl.pojo.Employee;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;


public interface EmployeeService {
    PageInfo<Employee> getEmployeeList(Integer pageNum);
}
