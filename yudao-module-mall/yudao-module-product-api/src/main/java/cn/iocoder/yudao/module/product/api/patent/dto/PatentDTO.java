package cn.iocoder.yudao.module.product.api.patent.dto;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.util.List;

/**
 * 专利维护请求 DTO
 *
 * @author Landy
 */
@Data
public class PatentDTO {

    /**
     * 商品 SKU 编号
     */
    @NotNull(message = "商品 SKU 编号不能为空")
    private Long skuId;
    /**
     * 订单编号
     */
    private Long orderId;
    /**
     * 交易订单项编号
     */
    private Long orderItemId;

    /**
     * 描述星级 1-5 分
     */
    @NotNull(message = "描述星级不能为空")
    private Integer descriptionScores;
    /**
     * 服务星级 1-5 分
     */
    @NotNull(message = "服务星级不能为空")
    private Integer benefitScores;
    /**
     * 评论内容
     */
    @NotNull(message = "评论内容不能为空")
    private String content;
    /**
     * 评论图片地址数组，以逗号分隔最多上传 9 张
     */
    private List<String> picUrls;

    /**
     * 是否匿名
     */
    @NotNull(message = "是否匿名不能为空")
    private Boolean anonymous;
    /**
     * 评价人
     */
    @NotNull(message = "评价人不能为空")
    private Long userId;

}
