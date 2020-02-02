package com.iof.spring.admin.plot.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.iof.spring.admin.plot.dao.AdminPlotDao;
import com.iof.spring.plot.model.VO.PlotVO;

@Service("AdminPlotService")
public class AdminPlotServiceImpl implements AdminPlotService {

	@Autowired
	/**
	 * @Qualifier("AdminPlotDao") 
	 * 특정 서비스를 지정 하여 가져오기 위한 Annotation 
	 */
	private AdminPlotDao dao;

	@Override
	public int AdminCreatePlot(PlotVO plot) {
		// TODO Auto-generated method stub
		System.out.println("Admin Create Plot Service");
		
		if(plot == null) {
			System.out.println("Not Plot Input");
			return 0;
		}
		return dao.AdminCreatePlot(plot);
	}

	@Override
	public List<PlotVO> AdminPagingPlot(int page) {
		// TODO Auto-generated method stub
		System.out.println("Admin Paging List Service");
		return null;
	}

	@Override
	public PlotVO AdminDetailPlot(PlotVO plot) {
		// TODO Auto-generated method stub
		System.out.println("Admin Detail Plot Service");
		return null;
	}

	@Override
	public PlotVO AdminUpdatePlot(PlotVO plot) {
		// TODO Auto-generated method stub
		System.out.println("Admin Update Plot Service");
		return null;
	}

	@Override
	public Map<String, Object> AdminDeletePlot(Map<String, Object> plot) {
		// TODO Auto-generated method stub
		System.out.println("Admin Delete Plot Service");
		return null;
	}

	@Override
	public List<PlotVO> AdminReloadPlot(int page) {
		// TODO Auto-generated method stub
		System.out.println("Admin Reload Plot Service");
		return null;
	}
}
