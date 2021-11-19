package net.ptnetwork.court.controller;

import com.baomidou.mybatisplus.extension.conditions.update.UpdateChainWrapper;
import lombok.RequiredArgsConstructor;
import net.ptnetwork.common.constant.Constants;
import net.ptnetwork.common.core.domain.AjaxResult;
import net.ptnetwork.court.domain.Litigant;
import net.ptnetwork.court.domain.Signature;
import net.ptnetwork.court.domain.Synergy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import net.ptnetwork.common.core.controller.BaseController;
import net.ptnetwork.court.service.ISignatureService;
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
@RequestMapping("/court/signature")
public class SignatureController extends BaseController {

    private final ISignatureService iSignatureService;

    /**
     * 获取签章列表
     */
    @PostMapping("/getSignature")
    public AjaxResult GetSignature(){
        System.out.println("获取签章列表。。。");
        AjaxResult ajax = AjaxResult.success();
        List<Signature> list = iSignatureService.GetSignature();
        System.out.println("list" + list);
        ajax.put(Constants.TOKEN,list);
        return ajax;
    }

    /**
     * 选择并查看签章详情（根据签章id查询）
     */
    @PostMapping("/selectSignature")
    public AjaxResult SelectSynergy(Signature signature){
        System.out.println("查看签章详情。。。");
        AjaxResult ajax = AjaxResult.success();
        signature.setId(Long.parseLong("3"));
        System.out.println("signature" + signature);
        List<Signature> list = iSignatureService.SelectSignature(signature);
        System.out.println("list" + list);
        ajax.put(Constants.TOKEN,list);
        return ajax;
    }


}
