这是一个共同模块，主要是放所有实体类，再有使用模块来调用，不再在其他模块。对应的实体类定为一个微服务模块，对应有个mybatis-plus模块的代码生成来运行这些实体类生成代码。
其他模块只需要把生成好的entity,mapper,service,controller搬运到该模块即可。同时数据库表也是自动生成，在公开模块写好的实体类标好注解，jpa+注解把表生成，
再根据表利用mybatis-plus逆向生成entity,mapper,service,controller即可。

遇到问题：目前本模块暂无问题！