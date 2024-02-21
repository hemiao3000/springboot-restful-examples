package com.example.springbootrestfulexample2.web;

import com.example.springbootrestfulexample2.entity.Department;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

@Api(tags = "部门信息管理")
@RestController
public class DepartmentController {

    @ApiOperation("根据ID查询部门信息")
    @GetMapping("/department/{id}")
    @ApiImplicitParam(name = "id", value = "部门ID", dataTypeClass = Long.class)
    public Department getDepartment(@PathVariable("id") Long id) {
        return new Department(id, "hello", "world");
    }

    @ApiOperation("新增部门信息")
    @PostMapping("/department")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "name", value = "部门名称", dataTypeClass = String.class),
            @ApiImplicitParam(name = "location", value = "部门所在地", dataTypeClass = String.class)
    })
    public Department getDepartment(@RequestParam("name") String name, @RequestParam("location") String location) {
        return new Department(0L, "hello", "world");
    }
}
