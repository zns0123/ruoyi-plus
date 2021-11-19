package net.ptnetwork.court.controller;

import com.baomidou.mybatisplus.extension.conditions.update.UpdateChainWrapper;
import lombok.RequiredArgsConstructor;
import net.ptnetwork.common.constant.Constants;
import net.ptnetwork.common.core.domain.AjaxResult;
import net.ptnetwork.court.domain.LawCase;
import net.ptnetwork.court.domain.Signature;
import net.ptnetwork.court.domain.Synergy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import net.ptnetwork.common.core.controller.BaseController;
import net.ptnetwork.court.service.ISynergyService;
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
@RequestMapping("/court/synergy")
public class SynergyController extends BaseController {

    private final ISynergyService iSynergyService;

    /**
     * 获取协同列表
     */
    @PostMapping("/getSynergy")
    public AjaxResult GetSynergy(){
        System.out.println("获取协同列表。。。");
        AjaxResult ajax = AjaxResult.success();
        List<Synergy> list = iSynergyService.GetSynergy();
        System.out.println("list" + list);
        ajax.put(Constants.TOKEN,list);
        return ajax;
    }

    /**
     * 查询协同（根据案件名模糊查询）
     */
    @PostMapping("/querySynergy")
    public AjaxResult QuerySynergy(Synergy synergy){
        System.out.println("查询协同。。。");
        AjaxResult ajax = AjaxResult.success();
        synergy.setCaseNo("8192");
        System.out.println("synergy" + synergy);
        List<Synergy> list = iSynergyService.QuerySynergy(synergy);
        System.out.println("list" + list);
        ajax.put(Constants.TOKEN,list);
        return ajax;
    }

    /**
     * 选择并查看协同详情（根据协同id查询）
     */
    @PostMapping("/selectSynergy")
    public AjaxResult SelectSynergy(Synergy synergy){
        System.out.println("查看协同详情。。。");
        AjaxResult ajax = AjaxResult.success();
        synergy.setId(Long.parseLong("2"));
        System.out.println("synergy" + synergy);
        List<Synergy> list = iSynergyService.SelectSynergy(synergy);
        System.out.println("list" + list);
        ajax.put(Constants.TOKEN,list);
        return ajax;
    }

    /**
     * 获取待发协同列表
     */
    @PostMapping("/waitSynergy")
    public AjaxResult WaitSynergy(Synergy synergy){
        System.out.println("获取待发协同列表。。。");
        AjaxResult ajax = AjaxResult.success();
        synergy.setState("审核待发");
        System.out.println("synergy" + synergy);
        List<Synergy> list = iSynergyService.WaitSynergy(synergy);
        System.out.println("list" + list);
        ajax.put(Constants.TOKEN,list);
        return ajax;
    }

}
