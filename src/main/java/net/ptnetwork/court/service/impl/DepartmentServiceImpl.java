package net.ptnetwork.court.service.impl;

import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import net.ptnetwork.court.domain.Department;
import net.ptnetwork.court.mapper.DepartmentMapper;
import net.ptnetwork.court.service.IDepartmentService;


/**
 * 部门信息Service业务层处理
 *
 * @author cyh
 * @date 2021-11-10
 */
@Service
public class DepartmentServiceImpl extends ServiceImpl<DepartmentMapper, Department> implements IDepartmentService {

}
