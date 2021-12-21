package com.bawei.network.factory;

import com.bawei.data_resource.network_type.Type;
import com.bawei.network.product.IProduct;

public
/**
 * 作者： 1904A 王天傲
 * 编写时间: 2021/9/25 14:39
 * 用途：
 */
interface IFactroy {
    void destroy();
    IProduct getHttp(Type type);
}
