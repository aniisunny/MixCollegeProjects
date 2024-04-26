package Problems;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class QuadrupletsSum {
	
	public static List < List < Integer > > fourSum ( int [] nums, int target ) {
		
		int i, j, k, l;
		int sum = 0;
		
		Arrays.sort ( nums );
		
		List < List < Integer > > list = new LinkedList < List < Integer > > ();
		
		for ( i = 0; i < nums.length - 3; i ++ ) {
			
			for ( j = i + 1; j < nums.length - 2; j ++ ) {
				
				for ( k = j + 1; k < nums.length - 1; k ++ ) {
					
					sum = nums [ i ] + nums [ j ] + nums [ k ];
					
					if ( target - sum < nums [ k ] ) 
						break;
					
					for ( l = k + 1; l < nums.length; l ++ ) {
						
						if ( nums [ l ] > target - sum ) 
							break;
						
						else if ( nums [ i ] + nums [ j ] + nums [ k ] + nums [ l ] == target ) {
							
							List < Integer > temp = new LinkedList < Integer > ();
							
							temp.add ( nums [ i ] );
							temp.add ( nums [ j ] );
							temp.add ( nums [ k ] );
							temp.add ( nums [ l ] );
							
							list.add ( temp );
							
							break;
							
						}
						
					}
					
				}
				
			}
			
		}
		
		HashSet < List > hashSet = new HashSet < List > ();
		Iterator < List < Integer > > itr = list.iterator ();
		
		while ( itr.hasNext () )
			hashSet.add ( itr.next () );
		
		List < List < Integer > > finalList = new LinkedList < List < Integer > > ();
		Iterator < List > itr1 = hashSet.iterator ();
		
		while ( itr1.hasNext () )
			finalList.add ( itr1.next () );
		
		return finalList;
        
    }

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		/*Scanner scan = new Scanner ( System.in );
		
		System.out.print ( "Enter the number of elements :- " );
		int n = scan.nextInt ();
		
		System.out.print ( "Enter the elements of array :- " );
		int nums [] = new int [ n ];
		
		for ( int i = 0; i < n; i++ ) 
			nums [ i ] =scan.nextInt ();
			
		System.out.print ( " Enter the Target :- " );
		int target = scan.nextInt ();*/
		
		int nums [ ] = new int [] { 82597,-9243,62390,83030,-97960,-26521,-61011,83390,-38677,
				12333,75987,46091,83794,19355,-71037,-6242,-28801,324,1202,-90885,-2989,-95597,
				-34333,35528,5680,89093,-90606,50360,-29393,-27012,53313,65213,99818,-82405,
				-41661,-3333,-51952,72135,-1523,26377,74685,96992,92263,15929,5467,-99555,-43348,
				-41689,-60383,-3990,32165,65265,-72973,-58372,12741,-48568,-46596,72419,-1859,
				34153,62937,81310,-61823,-96770,-54944,8845,-91184,24208,-29078,31495,65258,14198,
				85395,70506,-40908,56740,-12228,-40072,32429,93001,68445,-73927,25731,-91859,
				-24150,10093,-60271,-81683,-18126,51055,48189,-6468,25057,81194,-58628,74042,
				66158,-14452,-49851,-43667,11092,39189,-17025,-79173,13606,83172,92647,-59741,
				19343,-26644,-57607,82908,-20655,1637,80060,98994,39331,-31274,-61523,91225,
				-72953,13211,-75116,-98421,-41571,-69074,99587,39345,42151,-2460,98236,15690,
				-52507,-95803,-48935,-46492,-45606,-79254,-99851,52533,73486,39948,-7240,71815,
				-585,-96252,90990,-93815,93340,-71848,58733,-14859,-83082,-75794,-82082,-24871,
				-15206,91207,-56469,-93618,67131,-8682,75719,87429,-98757,-7535,-24890,-94160,
				85003,33928,75538,97456,-66424,-60074,-8527,-28697,-22308,2246,-70134,-82319,
				-10184,87081,-34949,-28645,-47352,-83966,-60418,-15293,-53067,-25921,55172,75064,
				95859,48049,34311,-86931,-38586,33686,-36714,96922,76713,-22165,-80585,-34503,
				-44516,39217,-28457,47227,-94036,43457,24626,-87359,26898,-70819,30528,-32397,
				-69486,84912,-1187,-98986,-32958,4280,-79129,-65604,9344,58964,50584,71128,-55480,
				24986,15086,-62360,-42977,-49482,-77256,-36895,-74818,20,3063,-49426,28152,-97329,
				6086,86035,-88743,35241,44249,19927,-10660,89404,24179,-26621,-6511,57745,-28750,
				96340,-97160,-97822,-49979,52307,79462,94273,-24808,77104,9255,-83057,77655,21361,
				55956,-9096,48599,-40490,-55107,2689,29608,20497,66834,-34678,23553,-81400,-66630,
				-96321,-34499,-12957,-20564,25610,-4322,-58462,20801,53700,71527,24669,-54534,57879,
				-3221,33636,3900,97832,-27688,-98715,5992,24520,-55401,-57613,-69926,57377,-77610,
				20123,52174,860,60429,-91994,-62403,-6218,-90610,-37263,-15052,62069,-96465,44254,
				89892,-3406,19121,-41842,-87783,-64125,-56120,73904,-22797,-58118,-4866,5356,75318,
				46119,21276,-19246,-9241,-97425,57333,-15802,93149,25689,-5532,95716,39209,-87672,
				-29470,-16324,-15331,27632,-39454,56530,-16000,29853,46475,78242,-46602,83192,-73440,
				-15816,50964,-36601,89758,38375,-40007,-36675,-94030,67576,46811,-64919,45595,76530,
				40398,35845,41791,67697,-30439,-82944,63115,33447,-36046,-50122,-34789,43003,-78947,
				-38763,-89210,32756,-20389,-31358,-90526,-81607,88741,86643,98422,47389,-75189,13091,
				95993,-15501,94260,-25584,-1483,-67261,-70753,25160,89614,-90620,-48542,83889,-12388,
				-9642,-37043,-67663,28794,-8801,13621,12241,55379,84290,21692,-95906,-85617,-17341,
				-63767,80183,-4942,-51478,30997,-13658,8838,17452,-82869,-39897,68449,31964,98158,
				-49489,62283,-62209,-92792,-59342,55146,-38533,20496,62667,62593,36095,-12470,5453,
				-50451,74716,-17902,3302,-16760,-71642,-34819,96459,-72860,21638,47342,-69897,-40180,
				44466,76496,84659,13848,-91600,-90887,-63742,-2156,-84981,-99280,94326,-33854,92029,
				-50811,98711,-36459,-75555,79110,-88164,-97397,-84217,97457,64387,30513,-53190,-83215,
				252,2344,-27177,-92945,-89010,82662,-11670,86069,53417,42702,97082,3695,-14530,-46334 };
				
		System.out.println(nums.length);
		
		System.out.println ( fourSum ( nums, 0 ) );

	}

}
