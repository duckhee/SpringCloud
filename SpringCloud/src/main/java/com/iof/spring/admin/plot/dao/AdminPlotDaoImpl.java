package com.iof.spring.admin.plot.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.iof.spring.plot.model.VO.PlotVO;

@Repository("AdminPlotDao")
public class AdminPlotDaoImpl implements AdminPlotDao{

	@Autowired
	private SqlSession session;

	@Override
	public int AdminCreatePlot(PlotVO plot) {
		// TODO Auto-generated method stub
		System.out.println("Admin Plot Create Dao");
		return session.insert("AdmincreatePlot", plot);
	}

	@Override
	public PlotVO AdminUpdatePlot(PlotVO plot) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int AdminAllPlotCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<PlotVO> AdminPagingPlot(int page) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<String, Object> AdminDeletePlot(PlotVO plot) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PlotVO AdminDetailPlot(PlotVO plot) {
		// TODO Auto-generated method stub
		return null;
	}
}
