package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.XinxitongjiDao;
import com.entity.XinxitongjiEntity;
import com.service.XinxitongjiService;
import com.entity.vo.XinxitongjiVO;
import com.entity.view.XinxitongjiView;

@Service("xinxitongjiService")
public class XinxitongjiServiceImpl extends ServiceImpl<XinxitongjiDao, XinxitongjiEntity> implements XinxitongjiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XinxitongjiEntity> page = this.selectPage(
                new Query<XinxitongjiEntity>(params).getPage(),
                new EntityWrapper<XinxitongjiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XinxitongjiEntity> wrapper) {
		  Page<XinxitongjiView> page =new Query<XinxitongjiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XinxitongjiVO> selectListVO(Wrapper<XinxitongjiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XinxitongjiVO selectVO(Wrapper<XinxitongjiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XinxitongjiView> selectListView(Wrapper<XinxitongjiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XinxitongjiView selectView(Wrapper<XinxitongjiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
