package net.ptnetwork.court.controller;

import com.baomidou.mybatisplus.extension.conditions.update.UpdateChainWrapper;
import lombok.RequiredArgsConstructor;
import net.ptnetwork.common.constant.Constants;
import net.ptnetwork.common.core.domain.AjaxResult;
import net.ptnetwork.court.domain.JudgeType;
import net.ptnetwork.court.domain.LawCase;
import net.ptnetwork.court.service.impl.LawCaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import net.ptnetwork.common.core.controller.BaseController;
import net.ptnetwork.court.service.ILawCaseService;
import io.swagger.annotations.Api;

import java.util.Arrays;
import java.util.List;

/**
 * 【请填写功能名称】Controller
 * 
 * @author cyh
 * @date 2021-11-10
 */
@Api(value = "【请填写功能名称】控制器", tags = {"【请填写功能名称】管理"})
@RequiredArgsConstructor(onConstructor_ = @Autowired)
@RestController
@RequestMapping("/court/case")
public class LawCaseController extends BaseController {

    @Autowired
    private LawCaseServiceImpl lawCaseService;

    /**
     * 获取案件列表
     */
    @PostMapping("/getCase")
    public AjaxResult GetCase(){
        System.out.println("获取案件列表。。。");
        AjaxResult ajax = AjaxResult.success();
        List<LawCase> list = lawCaseService.GetCase();
        System.out.println("list" + list);
        ajax.put(Constants.TOKEN,list);
        return ajax;
    }

    /**
     * 查询案件（根据案件名模糊查询）
     */
    @PostMapping("/queryCase")
    public AjaxResult QueryCase(LawCase lawCase){
        System.out.println("查询案件。。。");
        AjaxResult ajax = AjaxResult.success();
        lawCase.setCaseNo("1234");
        System.out.println("lawCase" + lawCase);
        List<LawCase> list = lawCaseService.QueryCase(lawCase);
        System.out.println("list" + list);
        ajax.put(Constants.TOKEN,list);
        return ajax;
    }

    /**
     * 选择并查看案件详情（根据案件名查询）
     */
    @PostMapping("/selectCase")
    public AjaxResult SelectCase(LawCase lawCase){
        System.out.println("查看案件详情。。。");
        AjaxResult ajax = AjaxResult.success();
        lawCase.setCaseNo("（2021）闽1522破1234号");
        System.out.println("lawCase" + lawCase);
        List<LawCase> list = lawCaseService.SelectCase(lawCase);
        System.out.println("list" + list);
        ajax.put(Constants.TOKEN,list);
        return ajax;
    }

}
