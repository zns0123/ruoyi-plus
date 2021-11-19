package net.ptnetwork.court.controller;

import com.baomidou.mybatisplus.extension.conditions.update.UpdateChainWrapper;
import lombok.RequiredArgsConstructor;
import net.ptnetwork.court.domain.Flow;
import net.ptnetwork.court.domain.Judge;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import net.ptnetwork.common.core.controller.BaseController;
import net.ptnetwork.court.service.IJudgeService;
import io.swagger.annotations.Api;

import java.util.Arrays;
import java.util.List;

/**
 * 法官信息Controller
 * 
 * @author cyh
 * @date 2021-11-10
 */
@Api(value = "法官信息控制器", tags = {"法官信息管理"})
@RequiredArgsConstructor(onConstructor_ = @Autowired)
@RestController
@RequestMapping("/court/judge")
public class JudgeController extends BaseController {

    private final IJudgeService iJudgeService;

}
