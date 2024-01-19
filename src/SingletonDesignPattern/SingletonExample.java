package SingletonDesignPattern;

import java.util.HashMap;

class LazyCacheService{
	private static LazyCacheService service = null;
	private HashMap<Integer, String> cacheMap = new HashMap<>();
	
	private LazyCacheService() {
		cacheMap = new HashMap<Integer, String>();
	}
	
	public static LazyCacheService getCache() {
		if(service == null) {
			service = new LazyCacheService();
		}
		return service;
	}
	
	public String getValue(int key) {
		return cacheMap.getOrDefault(key, "");
	}
	
	public void store(int key, String value) {
		cacheMap.put(key, value);
	}
}

class EagerCacheService{
	private static EagerCacheService service = new EagerCacheService();
	private HashMap<Integer, String> cacheMap = new HashMap<>();
	
	private EagerCacheService() {
		cacheMap = new HashMap<Integer, String>();
	}
	
	public static EagerCacheService getCache() {
		return service;
	}
	
	public String getValue(int key) {
		return cacheMap.getOrDefault(key, "");
	}
	
	public void store(int key, String value) {
		cacheMap.put(key, value);
	}
}

class SynchronizedCacheService {
    private static SynchronizedCacheService service = null;
    private HashMap<Integer, String> cacheMap;

    private SynchronizedCacheService() {
        cacheMap = new HashMap<Integer, String>();
    }

    public static synchronized SynchronizedCacheService getCache() {
        if (service == null) {
            service = new SynchronizedCacheService();
        }
        return service;
    }

    public String getValue(int key) {
        return cacheMap.getOrDefault(key, "");
    }

    public void store(int key, String value) {
        cacheMap.put(key, value);
    }
}

class DoubleCheckedLockingCacheService {

    private static volatile DoubleCheckedLockingCacheService service = null;
    private HashMap<Integer, String> cacheMap;

    private DoubleCheckedLockingCacheService() {
        cacheMap = new HashMap<Integer, String>();
    }

    public static DoubleCheckedLockingCacheService getCache() {
        if (service == null) {
            synchronized (DoubleCheckedLockingCacheService.class) {
                if (service == null) {
                    service = new DoubleCheckedLockingCacheService();
                }
            }
        }
        return service;
    }

    public String getValue(int key) {
        return cacheMap.getOrDefault(key, "");
    }

    public void store(int key, String value) {
        cacheMap.put(key, value);
    }
}

public class SingletonExample {
	public static void main(String[] args) {
		System.out.println("============== Lazy Implementation ============== \n");
		LazyCacheService service1 = LazyCacheService.getCache();
		service1.store(1, "Nikhil");		
		LazyCacheService service2 = LazyCacheService.getCache();
		String lazyValue = service2.getValue(1);
		System.out.println(lazyValue);
		
		System.out.println("============== Eager Implementation ============== \n");
		EagerCacheService service3 = EagerCacheService.getCache();
		service3.store(1, "Kumar");		
		EagerCacheService service4 = EagerCacheService.getCache();
		String eagerValue = service4.getValue(1);
		System.out.println(eagerValue);
		
		System.out.println("============== Synchronized Implementation ============== \n");
		SynchronizedCacheService service5 = SynchronizedCacheService.getCache();
		service5.store(1, "Nikhil Kumar");		
		SynchronizedCacheService service6 = SynchronizedCacheService.getCache();
		String synchronizedValue = service6.getValue(1);
		System.out.println(synchronizedValue);
		
		System.out.println("============== Double Checked Locking Implementation ============== \n");
		DoubleCheckedLockingCacheService service7 = DoubleCheckedLockingCacheService.getCache();
		service7.store(1, "Nikhil Vinay");		
		DoubleCheckedLockingCacheService service8 = DoubleCheckedLockingCacheService.getCache();
		String doubleCheckLockingValue = service8.getValue(1);
		System.out.println(doubleCheckLockingValue);
	}
}