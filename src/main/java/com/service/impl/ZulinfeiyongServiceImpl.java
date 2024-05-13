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


import com.dao.ZulinfeiyongDao;
import com.entity.ZulinfeiyongEntity;
import com.service.ZulinfeiyongService;
import com.entity.vo.ZulinfeiyongVO;
import com.entity.view.ZulinfeiyongView;

@Service("zulinfeiyongService")
public class ZulinfeiyongServiceImpl extends ServiceImpl<ZulinfeiyongDao, ZulinfeiyongEntity> implements ZulinfeiyongService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZulinfeiyongEntity> page = this.selectPage(
                new Query<ZulinfeiyongEntity>(params).getPage(),
                new EntityWrapper<ZulinfeiyongEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZulinfeiyongEntity> wrapper) {
		  Page<ZulinfeiyongView> page =new Query<ZulinfeiyongView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZulinfeiyongVO> selectListVO(Wrapper<ZulinfeiyongEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZulinfeiyongVO selectVO(Wrapper<ZulinfeiyongEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZulinfeiyongView> selectListView(Wrapper<ZulinfeiyongEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZulinfeiyongView selectView(Wrapper<ZulinfeiyongEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
