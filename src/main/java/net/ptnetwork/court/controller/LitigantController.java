package net.ptnetwork.court.controller;

import com.baomidou.mybatisplus.extension.conditions.update.UpdateChainWrapper;
import lombok.RequiredArgsConstructor;
import net.ptnetwork.common.constant.Constants;
import net.ptnetwork.common.core.domain.AjaxResult;
import net.ptnetwork.court.domain.LawCase;
import net.ptnetwork.court.domain.Litigant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import net.ptnetwork.common.core.controller.BaseController;
import net.ptnetwork.court.service.ILitigantService;
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
@RequestMapping("/court/litigant")
public class LitigantController extends BaseController {

    private final ILitigantService iLitigantService;

    /**
     * 展示当事人信息（通过案号）
     */
    @PostMapping("/showLitigant")
    public AjaxResult ShowLitigant(LawCase lawCase){
        System.out.println("展示当事人信息。。。");
        Litigant litigant = new Litigant();
        litigant.setCaseNo("（2021）闽2521执6543号");
        System.out.println("litigant" + litigant);
        AjaxResult ajax = AjaxResult.success();
        List<Litigant> list = iLitigantService.ShowLitigant(litigant);
        System.out.println("list" + list);
        ajax.put(Constants.TOKEN,list);
        return ajax;
    }

}
