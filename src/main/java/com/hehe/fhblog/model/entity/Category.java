package com.hehe.fhblog.model.entity;

import com.google.common.base.Objects;
import lombok.Data;
import lombok.Getter;

import java.io.Serializable;

/**
 * 分类
 * Date: 2017/9/4
 * Time: 下午12:02
 * @author xieqinghe .
 */
@Data
public class Category implements Serializable {

    private static final long serialVersionUID = 8888785780880511046L;
    private Integer id;
    /**
     * 名称
     */
    private String name;
    /**
     * 说明
     */
    private String desc;

    /**
     * 类型(1分类,2标签)
     */
    private Integer type;
    /**
     * 权重（从大到小）
     */
    private Integer weight;

    public static enum Type{
        CATEGORY(1, "分类"),
        TAG(2,"标签");

        @Getter
        private int value;
        @Getter
        private String display;
        private Type(int value, String display){
            this.value = value;
            this.display = display;
        }
        public static Category.Type from(int value) {
            for (Category.Type type1 : Category.Type.values()) {
                if (Objects.equal(value, type1.value)) {
                    return type1;
                }
            }
            return null;
        }
    }


}
