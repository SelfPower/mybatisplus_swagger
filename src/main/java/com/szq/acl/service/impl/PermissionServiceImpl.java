package com.szq.acl.service.impl;

import com.szq.acl.entity.Permission;
import com.szq.acl.mapper.PermissionMapper;
import com.szq.acl.service.PermissionService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 权限 服务实现类
 * </p>
 *
 * @author szq
 * @since 2020-04-29
 */
@Service
public class PermissionServiceImpl extends ServiceImpl<PermissionMapper, Permission> implements PermissionService {

}
