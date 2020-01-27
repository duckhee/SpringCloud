package com.iof.spring.admin.plot.service;

import java.util.List;
import java.util.Map;

import com.iof.spring.plot.model.VO.PlotVO;

public interface AdminPlotService {
	
	/** Create Plot Service */
	public int AdminCreatePlot(PlotVO plot);
	/** Paging Plot List Page Service */
	public List<PlotVO> AdminPagingPlot(int page);
	/** Detail Plot Page Service */
	public PlotVO AdminDetailPlot(PlotVO plot);
	/** Update Plot Service */
	public PlotVO AdminUpdatePlot(PlotVO plot);
	/** Delete Plot Service */
	public Map<String, Object> AdminDeletePlot(Map<String, Object> plot);
	/** Realod Plot List Service */
	public List<PlotVO> AdminReloadPlot(int page);

}
