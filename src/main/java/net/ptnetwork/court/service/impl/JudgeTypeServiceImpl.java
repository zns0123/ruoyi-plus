package net.ptnetwork.court.service.impl;

import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import net.ptnetwork.court.domain.JudgeType;
import net.ptnetwork.court.mapper.JudgeTypeMapper;
import net.ptnetwork.court.service.IJudgeTypeService;


/**
 * 法官类型信息Service业务层处理
 *
 * @author cyh
 * @date 2021-11-10
 */
@Service
public class JudgeTypeServiceImpl extends ServiceImpl<JudgeTypeMapper, JudgeType> implements IJudgeTypeService {

}
