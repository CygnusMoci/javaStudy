package thread.Mult_threadProgramming.day4_10;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import java.util.zip.DataFormatException;

/**
 * @author moci
 * @create 2018-04-11 13:56
 **/
public class PreLoader {
    private final FutureTask<ProductInfo> future =
            new FutureTask<ProductInfo>(new Callable<ProductInfo>() {
                @Override
                public ProductInfo call() throws Exception {
                    return loadProductInfo();
                }
            });
    private final Thread thread = new Thread(future);

    public void start(){ thread.start();}

    public ProductInfo get() throws DataFormatException,InterruptedException{
        try {
            return future.get();
        }catch (Exception e){
            Throwable cause = e.getCause();
            if(cause instanceof DataFormatException){
                throw (DataFormatException) cause;
            }else {
                throw launderThrowabld(cause);
            }

        }
    }


    private InterruptedException launderThrowabld(Throwable cause) {
        return new InterruptedException();
    }

    private ProductInfo loadProductInfo(){
        return new ProductInfo();
    }

    class ProductInfo{}

}
