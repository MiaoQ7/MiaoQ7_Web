package com.ruoyi.project.modules.csgo.goods.service;

import java.util.List;
import com.ruoyi.project.modules.csgo.goods.domain.CsgoGoods;

/**
 * 饰品库Service接口
 * 
 * @author ruoyi
 * @date 2023-06-04
 */
public interface ICsgoGoodsService 
{
    /**
     * 查询饰品库
     * 
     * @param goodsId 饰品库主键
     * @return 饰品库
     */
    public CsgoGoods selectCsgoGoodsByGoodsId(Long goodsId);

    /**
     * 查询饰品库列表
     * 
     * @param csgoGoods 饰品库
     * @return 饰品库集合
     */
    public List<CsgoGoods> selectCsgoGoodsList(CsgoGoods csgoGoods);

    /**
     * 新增饰品库
     * 
     * @param csgoGoods 饰品库
     * @return 结果
     */
    public int insertCsgoGoods(CsgoGoods csgoGoods);

    /**
     * 修改饰品库
     * 
     * @param csgoGoods 饰品库
     * @return 结果
     */
    public int updateCsgoGoods(CsgoGoods csgoGoods);

    /**
     * 批量删除饰品库
     * 
     * @param goodsIds 需要删除的饰品库主键集合
     * @return 结果
     */
    public int deleteCsgoGoodsByGoodsIds(String goodsIds);

    /**
     * 删除饰品库信息
     * 
     * @param goodsId 饰品库主键
     * @return 结果
     */
    public int deleteCsgoGoodsByGoodsId(Long goodsId);
}
