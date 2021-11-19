package net.ptnetwork.court.controller;

import com.baomidou.mybatisplus.extension.conditions.update.UpdateChainWrapper;
import lombok.RequiredArgsConstructor;
import net.ptnetwork.common.constant.Constants;
import net.ptnetwork.common.core.domain.AjaxResult;
import net.ptnetwork.court.domain.Synergy;
import net.ptnetwork.court.domain.Unit;
import net.ptnetwork.court.service.impl.UnitServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import net.ptnetwork.common.core.controller.BaseController;
import net.ptnetwork.court.service.IUnitService;
import io.swagger.annotations.Api;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
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
@RequestMapping("/court/unit")
public class UnitController extends BaseController {

    @Autowired
    private UnitServiceImpl unitService;

    /**
     * 单位登录
     */
    @PostMapping("/login")
    public AjaxResult UnitLogin(Unit unit, HttpServletRequest request){
        AjaxResult ajax = AjaxResult.success();
        System.out.println("单位请求登录。。。");
        unit.setAccount("13000000000");
        unit.setPassword("Haxt2021");
        List<Unit> list = unitService.UnitLogin(unit);
        System.out.println(list);
        ajax.put(Constants.TOKEN,list);
        return ajax;
//        if (unitService.UnitLogin(unit).isEmpty()){
//            return ajax;
//        }else{
//            HttpSession session = request.getSession();
//            session.setAttribute("account",unit.getAccount());
//            return ajax;
//        }
    }

    /**
     * 获取单位信息
     */
    @PostMapping("/getUnit")
    public AjaxResult GetUnit(Unit unit){
        System.out.println("获取单位信息。。。");
        AjaxResult ajax = AjaxResult.success();
        unit.setId(unit.getId());
        unit.setUnitName("出入境管理处");
        List<Unit> list = unitService.GetUnit(unit);
        System.out.println(list);
        ajax.put(Constants.TOKEN,list);
        return ajax;
    }

}