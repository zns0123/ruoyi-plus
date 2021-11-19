package net.ptnetwork.court.controller;

import com.baomidou.mybatisplus.extension.conditions.update.UpdateChainWrapper;
import lombok.RequiredArgsConstructor;
import net.ptnetwork.common.constant.Constants;
import net.ptnetwork.common.core.domain.AjaxResult;
import net.ptnetwork.court.domain.Department;
import net.ptnetwork.court.domain.Flow;
import net.ptnetwork.court.domain.Synergy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import net.ptnetwork.common.core.controller.BaseController;
import net.ptnetwork.court.service.IFlowService;
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
@RequestMapping("/court/flow")
public class FlowController extends BaseController {

    private final IFlowService iFlowService;

    /**
     * 流程日志列表
     */
    @PostMapping("getFlow")
    public AjaxResult GetFlow(){
        System.out.println("获取流程日志列表。。。");
        AjaxResult ajax = AjaxResult.success();
        List<Flow> list = iFlowService.GetFlow();
        System.out.println("list" + list);
        ajax.put(Constants.TOKEN,list);
        return ajax;
    }

}
