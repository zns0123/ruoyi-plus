package net.ptnetwork.court.controller;

import com.baomidou.mybatisplus.extension.conditions.update.UpdateChainWrapper;
import lombok.RequiredArgsConstructor;
import net.ptnetwork.court.domain.Brief;
import net.ptnetwork.court.domain.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import net.ptnetwork.common.core.controller.BaseController;
import net.ptnetwork.court.service.IDepartmentService;
import io.swagger.annotations.Api;

import java.util.Arrays;
import java.util.List;

/**
 * 部门信息Controller
 * 
 * @author cyh
 * @date 2021-11-10
 */
@Api(value = "部门信息控制器", tags = {"部门信息管理"})
@RequiredArgsConstructor(onConstructor_ = @Autowired)
@RestController
@RequestMapping("/court/department")
public class DepartmentController extends BaseController {

    private final IDepartmentService iDepartmentService;

}
