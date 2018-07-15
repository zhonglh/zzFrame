

        
        <!-- Ehcache2.x的变化(取自https://github.com/springside/springside4/wiki/Ehcache) -->  
        <!-- 1)最好在ehcache.xml中声明不进行updateCheck -->  
        <!-- 2)为了配合BigMemory和Size Limit,原来的属性最好改名 -->  
        <!--   maxElementsInMemory->maxEntriesLocalHeap -->  
        <!--   maxElementsOnDisk->maxEntriesLocalDisk -->

        timeToLiveSeconds 当缓存闲置n秒后销毁 为了保障会调用ShiroSessionDao的doReadSession方法，所以不配置该属性
        timeToIdleSeconds 当缓存存活n秒后销毁 必须比Redis中央缓存中过期时间短
      
        name:缓存名称。
        maxElementsInMemory：缓存最大个数。
        eternal:对象是否永久有效，一但设置了，timeout将不起作用。
        timeToIdleSeconds：设置对象在失效前的允许闲置时间（单位：秒）。仅当eternal=false对象不是永久有效时使用，可选属性，默认值是0，也就是可闲置时间无穷大。
        timeToLiveSeconds：设置对象在失效前允许存活时间（单位：秒）。最大时间介于创建时间和失效时间之间。仅当eternal=false对象不是永久有效时使用，默认是0.，也就是对象存活时间无穷大。
        overflowToDisk：当内存中对象数量达到maxElementsInMemory时，Ehcache将会对象写到磁盘中。
        diskSpoolBufferSizeMB：这个参数设置DiskStore（磁盘缓存）的缓存区大小。默认是30MB。每个Cache都应该有自己的一个缓冲区。
        maxElementsOnDisk：硬盘最大缓存个数。
        diskPersistent：是否缓存虚拟机重启期数据 Whether the disk store persists between restarts of the Virtual Machine. The default value is false.
        diskExpiryThreadIntervalSeconds：磁盘失效线程运行时间间隔，默认是120秒。
        memoryStoreEvictionPolicy：当达到maxElementsInMemory限制时，Ehcache将会根据指定的策略去清理内存。默认策略是LRU（最近最少使用）。你可以设置为FIFO（先进先出）或是LFU（较少使用）。
        clearOnFlush：内存数量最大时是否清除。
       
    
    
        maxElementsOnDisk="20000"           
        <diskStore>==========当内存缓存中对象数量超过maxElementsInMemory时,将缓存对象写到磁盘缓存中(需对象实现序列化接口)  
        <diskStore path="">==用来配置磁盘缓存使用的物理路径,Ehcache磁盘缓存使用的文件后缀名是*.data和*.index  
        name=================缓存名称,cache的唯一标识(ehcache会把这个cache放到HashMap里)  
        maxElementsOnDisk====磁盘缓存中最多可以存放的元素数量,0表示无穷大  
        maxElementsInMemory==内存缓存中最多可以存放的元素数量,若放入Cache中的元素超过这个数值,则有以下两种情况  
                             1)若overflowToDisk=true,则会将Cache中多出的元素放入磁盘文件中  
                             2)若overflowToDisk=false,则根据memoryStoreEvictionPolicy策略替换Cache中原有的元素  
        eternal==============缓存中对象是否永久有效,即是否永驻内存,true时将忽略timeToIdleSeconds和timeToLiveSeconds  
        timeToIdleSeconds====缓存数据在失效前的允许闲置时间(单位:秒),仅当eternal=false时使用,默认值是0表示可闲置时间无穷大,此为可选属性  
                             即访问这个cache中元素的最大间隔时间,若超过这个时间没有访问此Cache中的某个元素,那么此元素将被从Cache中清除  
        timeToLiveSeconds====缓存数据在失效前的允许存活时间(单位:秒),仅当eternal=false时使用,默认值是0表示可存活时间无穷大  
                             即Cache中的某元素从创建到清楚的生存时间,也就是说从创建开始计时,当超过这个时间时,此元素将从Cache中清除  
        overflowToDisk=======内存不足时,是否启用磁盘缓存(即内存中对象数量达到maxElementsInMemory时,Ehcache会将对象写到磁盘中)  
                             会根据标签中path值查找对应的属性值,写入磁盘的文件会放在path文件夹下,文件的名称是cache的名称,后缀名是data  
        diskPersistent=======是否持久化磁盘缓存,当这个属性的值为true时,系统在初始化时会在磁盘中查找文件名为cache名称,后缀名为index的文件  
                             这个文件中存放了已经持久化在磁盘中的cache的index,找到后会把cache加载到内存  
                             要想把cache真正持久化到磁盘,写程序时注意执行net.sf.ehcache.Cache.put(Element element)后要调用flush()方法  
        diskExpiryThreadIntervalSeconds==磁盘缓存的清理线程运行间隔,默认是120秒  
        diskSpoolBufferSizeMB============设置DiskStore（磁盘缓存）的缓存区大小,默认是30MB  
        memoryStoreEvictionPolicy========内存存储与释放策略,即达到maxElementsInMemory限制时,Ehcache会根据指定策略清理内存  
                    
                    
                    
                
                
                
                
                
                
                    
                    
                    
        
        <?xml version="1.0" encoding="UTF-8"?>
        <ehcache dynamicConfig="false" monitoring="off" updateCheck="false"
             xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:noNamespaceSchemaLocation="ehcache.xsd"> 
         
          <!-- 定义缓存策略 
            eternal="false"         // 元素是否永恒,如果是就永不过期(必须设置) 
            maxEntriesLocalHeap="1000"   // 堆内存中最大缓存对象数,0没有限制(必须设置) 
            overflowToDisk="false"     // 当缓存达到maxElementsInMemory值是,是否允许溢出到磁盘(必须设置) 
            diskPersistent="false"     // 磁盘缓存在VM重新启动时是否保持(默认为false) 
            timeToIdleSeconds="0"      // 导致元素过期的访问间隔(秒为单位). 当eternal为false时，这个属性才有效，0表示可以永远空闲,默认为0 
            timeToLiveSeconds="600"     // 元素在缓存里存在的时间(秒为单位). 0 表示永远存在不过期 
            memoryStoreEvictionPolicy="LFU" // 当达到maxElementsInMemory时,如何强制进行驱逐默认使用"最近使用(LRU)"策略,其它还有先入先出FIFO,最少使用LFU,较少使用LRU 
          -->
         
          <!--
            1）maxElementsInMemory（正整数）：在内存中缓存的最大对象数量
        　　  2）maxElementsOnDisk（正整数）：在磁盘上缓存的最大对象数量，默认值为0，表示不限制。 
        　　  3）eternal：设定缓存对象保存的永久属性，默认为 false 。当为 true 时 timeToIdleSeconds、timeToLiveSeconds 失效。 
        　　  4）timeToIdleSeconds（单位：秒）：　对象空闲时间，指对象在多长时间没有被访问就会失效。只对eternal为false的有效。默认值0，表示一直可以访问。
        　　  5）timeToLiveSeconds（单位：秒）：　对象存活时间，指对象从创建到失效所需要的时间。只对eternal为false的有效。默认值0，表示一直可以访问。
        　　  6）overflowToDisk：如果内存中数据超过内存限制，是否要缓存到磁盘上。 
        　　  7）diskPersistent：是否在磁盘上持久化。指重启jvm后，数据是否有效。默认为false。 
          8）diskSpoolBufferSizeMB（单位：MB）：　DiskStore使用的磁盘大小，默认值30MB。每个cache使用各自的DiskStore。
        　　  9）memoryStoreEvictionPolicy：如果内存中数据超过内存限制，向磁盘缓存时的策略。默认值LRU，可选FIFO、LFU。
            FIFO（first in first out）：先进先出
            LFU（Less Frequently Used）:最少被使用，缓存的元素有一个hit属性，hit值最小的将会被清除缓存。
            LRU（Least Recently Used）默认策略：最近最少使用，缓存的元素有一个时间戳，当缓存容量满了，而又需要腾出地方来缓存新的元素的时候，那么现有缓存元素中时间戳离当前时间最远的元素将被清除缓存。
          10) maxEntriesLocalHeap 堆内存中最大缓存对象数  
          -->
            <diskStore path="java.io.tmpdir"></diskStore>
          <defaultCache
            eternal="false"
            maxEntriesLocalHeap="0"
            timeToIdleSeconds="120"
            timeToLiveSeconds="120"
            maxElementsInMemory="10000"
            overflowToDisk="true"
            diskPersistent="true"
          /> 
         
          <cache
            name="userCache"
            maxEntriesLocalHeap="10000"
          />  
          <cache
            name="studentCache"
            maxEntriesLocalHeap="10000"
          />
         
        </ehcache>