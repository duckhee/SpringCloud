package com.iof.spring.admin.plot.dao;

import java.util.List;
import java.util.Map;

import com.iof.spring.plot.model.VO.PlotVO;

public interface AdminPlotDao {
	/** Admin Plot Create Dao */
	public int AdminCreatePlot(PlotVO plot);
	/** Admin Plot Update Dao */
	public PlotVO AdminUpdatePlot(PlotVO plot);
	/** Admin Plot Count all */
	public int AdminAllPlotCount();
	/** Admin Plot Paging Dao */
	public List<PlotVO> AdminPagingPlot(int page);
	/** Admin Plot Delete Dao */
	public Map<String, Object> AdminDeletePlot(PlotVO plot);
	/** Admin Plot Detail Dao */
	public PlotVO AdminDetailPlot(PlotVO plot);
}
