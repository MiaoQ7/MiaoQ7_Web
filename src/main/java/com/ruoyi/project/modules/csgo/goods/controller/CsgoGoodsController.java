package com.ruoyi.project.modules.csgo.goods.controller;

import java.util.List;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.ruoyi.framework.aspectj.lang.annotation.Log;
import com.ruoyi.framework.aspectj.lang.enums.BusinessType;
import com.ruoyi.project.modules.csgo.goods.domain.CsgoGoods;
import com.ruoyi.project.modules.csgo.goods.service.ICsgoGoodsService;
import com.ruoyi.framework.web.controller.BaseController;
import com.ruoyi.framework.web.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.framework.web.page.TableDataInfo;

/**
 * 饰品库Controller
 * 
 * @author ruoyi
 * @date 2023-06-04
 */
@Controller
@RequestMapping("/csgo/goods")
public class CsgoGoodsController extends BaseController
{
    private String prefix = "csgo/goods";

    @Autowired
    private ICsgoGoodsService csgoGoodsService;

    @RequiresPermissions("csgo:goods:view")
    @GetMapping()
    public String goods()
    {
        return prefix + "/goods";
    }

    /**
     * 查询饰品库列表
     */
    @RequiresPermissions("csgo:goods:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(CsgoGoods csgoGoods)
    {
        startPage();
        List<CsgoGoods> list = csgoGoodsService.selectCsgoGoodsList(csgoGoods);
        return getDataTable(list);
    }

    /**
     * 导出饰品库列表
     */
    @RequiresPermissions("csgo:goods:export")
    @Log(title = "饰品库", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(CsgoGoods csgoGoods)
    {
        List<CsgoGoods> list = csgoGoodsService.selectCsgoGoodsList(csgoGoods);
        ExcelUtil<CsgoGoods> util = new ExcelUtil<CsgoGoods>(CsgoGoods.class);
        return util.exportExcel(list, "饰品库数据");
    }

    /**
     * 新增饰品库
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存饰品库
     */
    @RequiresPermissions("csgo:goods:add")
    @Log(title = "饰品库", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(CsgoGoods csgoGoods)
    {
        return toAjax(csgoGoodsService.insertCsgoGoods(csgoGoods));
    }

    /**
     * 修改饰品库
     */
    @RequiresPermissions("csgo:goods:edit")
    @GetMapping("/edit/{goodsId}")
    public String edit(@PathVariable("goodsId") Long goodsId, ModelMap mmap)
    {
        CsgoGoods csgoGoods = csgoGoodsService.selectCsgoGoodsByGoodsId(goodsId);
        mmap.put("csgoGoods", csgoGoods);
        return prefix + "/edit";
    }

    /**
     * 修改保存饰品库
     */
    @RequiresPermissions("csgo:goods:edit")
    @Log(title = "饰品库", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(CsgoGoods csgoGoods)
    {
        return toAjax(csgoGoodsService.updateCsgoGoods(csgoGoods));
    }

    /**
     * 删除饰品库
     */
    @RequiresPermissions("csgo:goods:remove")
    @Log(title = "饰品库", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(csgoGoodsService.deleteCsgoGoodsByGoodsIds(ids));
    }
}
