package com.ruoyi.project.modules.csgo.goods.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.project.modules.csgo.goods.mapper.CsgoGoodsMapper;
import com.ruoyi.project.modules.csgo.goods.domain.CsgoGoods;
import com.ruoyi.project.modules.csgo.goods.service.ICsgoGoodsService;
import com.ruoyi.common.utils.text.Convert;

/**
 * 饰品库Service业务层处理
 * 
 * @author ruoyi
 * @date 2023-06-04
 */
@Service
public class CsgoGoodsServiceImpl implements ICsgoGoodsService 
{
    @Autowired
    private CsgoGoodsMapper csgoGoodsMapper;

    /**
     * 查询饰品库
     * 
     * @param goodsId 饰品库主键
     * @return 饰品库
     */
    @Override
    public CsgoGoods selectCsgoGoodsByGoodsId(Long goodsId)
    {
        return csgoGoodsMapper.selectCsgoGoodsByGoodsId(goodsId);
    }

    /**
     * 查询饰品库列表
     * 
     * @param csgoGoods 饰品库
     * @return 饰品库
     */
    @Override
    public List<CsgoGoods> selectCsgoGoodsList(CsgoGoods csgoGoods)
    {
        return csgoGoodsMapper.selectCsgoGoodsList(csgoGoods);
    }

    /**
     * 新增饰品库
     * 
     * @param csgoGoods 饰品库
     * @return 结果
     */
    @Override
    public int insertCsgoGoods(CsgoGoods csgoGoods)
    {
        csgoGoods.setCreateTime(DateUtils.getNowDate());
        return csgoGoodsMapper.insertCsgoGoods(csgoGoods);
    }

    /**
     * 修改饰品库
     * 
     * @param csgoGoods 饰品库
     * @return 结果
     */
    @Override
    public int updateCsgoGoods(CsgoGoods csgoGoods)
    {
        csgoGoods.setUpdateTime(DateUtils.getNowDate());
        return csgoGoodsMapper.updateCsgoGoods(csgoGoods);
    }

    /**
     * 批量删除饰品库
     * 
     * @param goodsIds 需要删除的饰品库主键
     * @return 结果
     */
    @Override
    public int deleteCsgoGoodsByGoodsIds(String goodsIds)
    {
        return csgoGoodsMapper.deleteCsgoGoodsByGoodsIds(Convert.toStrArray(goodsIds));
    }

    /**
     * 删除饰品库信息
     * 
     * @param goodsId 饰品库主键
     * @return 结果
     */
    @Override
    public int deleteCsgoGoodsByGoodsId(Long goodsId)
    {
        return csgoGoodsMapper.deleteCsgoGoodsByGoodsId(goodsId);
    }
}
