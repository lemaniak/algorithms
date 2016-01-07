package com.vicente.algorithms.basics.algoritms.MasterDetail;

import java.util.*;

/**
 * Created by vicente on 20/03/15.
 */
public class MasterDetailSummary {

    private static List<MetricsDetail> detail = new ArrayList<MetricsDetail>();

    public static void main(String[]args){
        Song s = new Song(1,"first");
        Song s2 = new Song(2,"second");
        Song s3 = new Song(3,"third");

        Metric metric= new Metric(1,"like");
        Metric metric1= new Metric(2,"unlike");
        Metric metric2= new Metric(3,"vote");
        Metric metric3= new Metric(4,"unvote");


        MetricsDetail metricd = new MetricsDetail(1,s,metric,5);
        MetricsDetail metricd2 = new MetricsDetail(2,s,metric1,15);
        MetricsDetail metricd3 = new MetricsDetail(3,s,metric2,5);
        MetricsDetail metricd4 = new MetricsDetail(4,s,metric3,5);
        MetricsDetail metricd5 = new MetricsDetail(5,s2,metric1,5);
        MetricsDetail metricd6 = new MetricsDetail(1,s3,metric,5);

        detail.add(metricd);
        detail.add(metricd2);
        detail.add(metricd3);
        detail.add(metricd4);
        detail.add(metricd5);
        detail.add(metricd6);

        List<Metric> summaryMetrics= new ArrayList<Metric>();
        summaryMetrics.add(metric);
        summaryMetrics.add(metric1);

        List<Song> songs = new ArrayList<Song>();
        songs.add(s);
        songs.add(s2);
        songs.add(s3);
        Map<Integer,List<MetricsDetail>> result = getSummary(summaryMetrics,songs);
        System.out.println(result);
    }


    public  static Map<Integer,List<MetricsDetail>> getSummary(List<Metric> metrics,List<Song> songs){
        Map<Integer,List<MetricsDetail>> response = new HashMap<Integer, List<MetricsDetail>>();
        List<MetricsDetail> list ;
        for(MetricsDetail md : detail){
            if(!response.containsKey(md.getSong().getId())){
               list = new ArrayList<MetricsDetail>();
               list.add(md);
               response.put(md.getSong().getId(), list);
            }else{
                list=response.get(md.getSong().getId());
                list.add(md);
            }
        }

        for(Song s:songs){
            List<MetricsDetail> songMetrics=response.get(s.getId());
            Iterator it = songMetrics.iterator();
            while(it.hasNext()){
                MetricsDetail md = (MetricsDetail) it.next();
                if(!metrics.contains(md.getMetric())){
                    it.remove();
                }
            }
        }

        return response;
    }
}
