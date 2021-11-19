package net.ptnetwork.court.service.impl;

import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import net.ptnetwork.court.domain.Judge;
import net.ptnetwork.court.mapper.JudgeMapper;
import net.ptnetwork.court.service.IJudgeService;


/**
 * 法官信息Service业务层处理
 *
 * @author cyh
 * @date 2021-11-10
 */
@Service
public class JudgeServiceImpl extends ServiceImpl<JudgeMapper, Judge> implements IJudgeService {

}
