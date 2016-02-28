{:node-18637
 {:tpn-type :p-end,
  :uid :node-18637,
  :activities #{},
  :incidence-set #{:act-18642 :act-18640 :act-18644}},
 :node-18638
 {:constraints #{},
  :uid :node-18638,
  :tpn-type :p-begin,
  :end-node :node-18637,
  :activities #{:act-18643 :act-18641 :act-18639},
  :incidence-set #{}},
 :act-18614
 {:tpn-type :null-activity,
  :uid :act-18614,
  :end-node :node-18606,
  :label :slow-path},
 :cnstr-18646
 {:tpn-type :temporal-constraint,
  :uid :cnstr-18646,
  :value [5 20],
  :end-node :node-18623,
  :between [:acquire :analyze]},
 :act-18566
 {:tpn-type :null-activity, :uid :act-18566, :end-node :node-18559},
 :act-18627
 {:tpn-type :null-activity, :uid :act-18627, :end-node :node-18622},
 :act-18561
 {:constraints #{},
  :non-primitive false,
  :plantid "",
  :uid :act-18561,
  :name "watch-left-hemisphere",
  :tpn-type :activity,
  :plant "plant",
  :command "watch-left-hemisphere",
  :reward 0,
  :end-node :node-18560,
  :cost 0},
 :network-id :net-18645,
 :act-18572
 {:constraints #{:cnstr-18571},
  :non-primitive false,
  :plantid "",
  :uid :act-18572,
  :name "take-high-res-images",
  :tpn-type :activity,
  :plant "plant",
  :command "take-high-res-images",
  :reward 0,
  :end-node :node-18570,
  :cost 0},
 :act-18625
 {:tpn-type :null-activity, :uid :act-18625, :end-node :node-18622},
 :node-18623
 {:constraints #{},
  :label :analyze,
  :uid :node-18623,
  :tpn-type :p-begin,
  :end-node :node-18622,
  :activities #{:act-18628 :act-18626 :act-18624},
  :incidence-set #{:act-18634}},
 :act-18567
 {:tpn-type :null-activity, :uid :act-18567, :end-node :node-18563},
 :act-18643
 {:tpn-type :null-activity, :uid :act-18643, :end-node :node-18592},
 :node-18630
 {:tpn-type :state,
  :uid :node-18630,
  :constraints #{:cnstr-18649},
  :activities #{:act-18644},
  :incidence-set #{:act-18632}},
 :act-18598
 {:tpn-type :null-activity, :uid :act-18598, :end-node :node-18591},
 :cnstr-18557
 {:tpn-type :temporal-constraint,
  :uid :cnstr-18557,
  :value [10 20],
  :end-node :node-18556},
 :act-18601
 {:constraints #{:cnstr-18600},
  :non-primitive false,
  :plantid "",
  :uid :act-18601,
  :name "picture-analysis-type-1",
  :tpn-type :activity,
  :plant "plant",
  :command "picture-analysis-type-1",
  :reward 0,
  :end-node :node-18599,
  :cost 0},
 :act-18593
 {:tpn-type :null-activity, :uid :act-18593, :end-node :node-18573},
 :node-18613
 {:constraints #{:cnstr-18612},
  :uid :node-18613,
  :tpn-type :c-begin,
  :end-node :node-18611,
  :activities #{:act-18614 :act-18616},
  :incidence-set #{:act-18626}},
 :act-18597
 {:tpn-type :null-activity, :uid :act-18597, :end-node :node-18585},
 :node-18570
 {:tpn-type :state,
  :uid :node-18570,
  :constraints #{},
  :activities #{:act-18576},
  :incidence-set #{:act-18572}},
 :act-18554
 {:constraints #{:cnstr-18553},
  :non-primitive false,
  :plantid "",
  :uid :act-18554,
  :name "track-elephant",
  :tpn-type :activity,
  :plant "plant",
  :command "track-elephant",
  :reward 0,
  :end-node :node-18552,
  :cost 0},
 :act-18568
 {:tpn-type :null-activity, :uid :act-18568, :end-node :node-18562},
 :cnstr-18648
 {:tpn-type :temporal-constraint,
  :uid :cnstr-18648,
  :value [0 5],
  :end-node :node-18556,
  :between-ends [:phase-3 :watch-right]},
 :node-18563
 {:tpn-type :p-end,
  :uid :node-18563,
  :activities #{:act-18642},
  :incidence-set #{:act-18567 :act-18569}},
 :act-18580
 {:constraints #{:cnstr-18579},
  :non-primitive false,
  :plantid "",
  :uid :act-18580,
  :name "take-move-low-res-images",
  :tpn-type :activity,
  :plant "plant",
  :command "take-move-low-res-images",
  :reward 0,
  :end-node :node-18578,
  :cost 0},
 :act-18620
 {:constraints #{:cnstr-18619},
  :non-primitive false,
  :plantid "",
  :uid :act-18620,
  :name "picture-analysis-type-3",
  :tpn-type :activity,
  :plant "plant",
  :command "picture-analysis-type-3",
  :reward 0,
  :end-node :node-18618,
  :label :phase-3,
  :cost 0},
 :act-18596
 {:tpn-type :null-activity, :uid :act-18596, :end-node :node-18591},
 :act-18558
 {:constraints #{:cnstr-18557},
  :non-primitive false,
  :plantid "",
  :uid :act-18558,
  :name "watch-right-hemisphere",
  :tpn-type :activity,
  :plant "plant",
  :command "watch-right-hemisphere",
  :reward 0,
  :end-node :node-18556,
  :label :watch-right,
  :cost 0},
 :cnstr-18636
 {:tpn-type :temporal-constraint,
  :uid :cnstr-18636,
  :value [123 456],
  :end-node :node-18630},
 :node-18573
 {:tpn-type :state,
  :uid :node-18573,
  :constraints #{},
  :activities #{:act-18572},
  :incidence-set #{:act-18593}},
 :cnstr-18575
 {:tpn-type :temporal-constraint,
  :uid :cnstr-18575,
  :value [0 4],
  :end-node :node-18574},
 :act-18641
 {:tpn-type :null-activity, :uid :act-18641, :end-node :node-18565},
 :node-18607
 {:tpn-type :state,
  :uid :node-18607,
  :constraints #{},
  :activities #{:act-18617},
  :incidence-set #{:act-18609}},
 :act-18642
 {:tpn-type :null-activity, :uid :act-18642, :end-node :node-18637},
 :node-18633
 {:tpn-type :state,
  :uid :node-18633,
  :constraints #{},
  :activities #{:act-18632},
  :incidence-set #{:act-18635}},
 :node-18581
 {:tpn-type :state,
  :uid :node-18581,
  :constraints #{},
  :activities #{:act-18580},
  :incidence-set #{:act-18595}},
 :cnstr-18647
 {:tpn-type :temporal-constraint,
  :uid :cnstr-18647,
  :value [50 :infinity],
  :end-node :node-18621,
  :between-starts [:watch-right :phase-3]},
 :cnstr-18619
 {:tpn-type :temporal-constraint,
  :uid :cnstr-18619,
  :value [0 7],
  :end-node :node-18618},
 :node-18555
 {:tpn-type :state,
  :uid :node-18555,
  :constraints #{},
  :activities #{:act-18554},
  :incidence-set #{:act-18639}},
 :cnstr-18612
 {:tpn-type :temporal-constraint,
  :uid :cnstr-18612,
  :value [0 15],
  :end-node :node-18611},
 :act-18569
 {:tpn-type :null-activity, :uid :act-18569, :end-node :node-18563},
 :act-18576
 {:constraints #{:cnstr-18575},
  :non-primitive false,
  :plantid "",
  :uid :act-18576,
  :name "move-high-res-images",
  :tpn-type :activity,
  :plant "plant",
  :command "move-high-res-images",
  :reward 0,
  :end-node :node-18574,
  :cost 0},
 :act-18632
 {:constraints #{:cnstr-18631},
  :non-primitive false,
  :plantid "",
  :uid :act-18632,
  :name "picture-distribution",
  :tpn-type :activity,
  :plant "plant",
  :command "picture-distribution",
  :reward 0,
  :end-node :node-18630,
  :cost 0},
 :act-18628
 {:tpn-type :null-activity, :uid :act-18628, :end-node :node-18621},
 :node-18565
 {:constraints #{:cnstr-18564},
  :uid :node-18565,
  :tpn-type :p-begin,
  :end-node :node-18563,
  :activities #{:act-18566 :act-18568},
  :incidence-set #{:act-18641}},
 :cnstr-18604
 {:tpn-type :temporal-constraint,
  :uid :cnstr-18604,
  :value [0 10],
  :end-node :node-18603},
 :node-18611
 {:tpn-type :c-end,
  :uid :node-18611,
  :activities #{:act-18627},
  :incidence-set #{:act-18617 :act-18615}},
 :act-18626
 {:tpn-type :null-activity, :uid :act-18626, :end-node :node-18613},
 :act-18634
 {:tpn-type :null-activity, :uid :act-18634, :end-node :node-18623},
 :cnstr-18583
 {:tpn-type :temporal-constraint,
  :uid :cnstr-18583,
  :value [0 3],
  :end-node :node-18582},
 :act-18605
 {:constraints #{:cnstr-18604},
  :non-primitive false,
  :plantid "",
  :uid :act-18605,
  :name "picture-analysis-type-2-slow",
  :tpn-type :activity,
  :plant "plant",
  :command "picture-analysis-type-2-slow",
  :reward 0,
  :end-node :node-18603,
  :cost 0},
 :node-18578
 {:tpn-type :state,
  :uid :node-18578,
  :constraints #{},
  :activities #{:act-18596},
  :incidence-set #{:act-18580}},
 :act-18624
 {:tpn-type :null-activity, :uid :act-18624, :end-node :node-18602},
 :act-18609
 {:constraints #{:cnstr-18608},
  :non-primitive false,
  :plantid "",
  :uid :act-18609,
  :name "picture-analysis-type-2-fast",
  :tpn-type :activity,
  :plant "plant",
  :command "picture-analysis-type-2-fast",
  :reward 0,
  :end-node :node-18607,
  :cost 0},
 :node-18599
 {:tpn-type :state,
  :uid :node-18599,
  :constraints #{},
  :activities #{:act-18625},
  :incidence-set #{:act-18601}},
 :act-18616
 {:tpn-type :null-activity, :uid :act-18616, :end-node :node-18610},
 :node-18585
 {:tpn-type :state,
  :uid :node-18585,
  :constraints #{:cnstr-18590},
  :activities #{:act-18584},
  :incidence-set #{:act-18597}},
 :act-18595
 {:tpn-type :null-activity, :uid :act-18595, :end-node :node-18581},
 :act-18584
 {:constraints #{:cnstr-18583},
  :non-primitive false,
  :plantid "",
  :uid :act-18584,
  :name "take-medium-res-images",
  :tpn-type :activity,
  :plant "plant",
  :command "take-medium-res-images",
  :reward 0,
  :end-node :node-18582,
  :cost 0},
 :cnstr-18564
 {:tpn-type :temporal-constraint,
  :uid :cnstr-18564,
  :value [20 25],
  :end-node :node-18563},
 :cnstr-18587
 {:tpn-type :temporal-constraint,
  :uid :cnstr-18587,
  :value [0 4],
  :end-node :node-18586},
 :node-18560
 {:tpn-type :state,
  :uid :node-18560,
  :constraints #{},
  :activities #{:act-18569},
  :incidence-set #{:act-18561}},
 :node-18618
 {:tpn-type :state,
  :uid :node-18618,
  :constraints #{:cnstr-18648},
  :activities #{:act-18629},
  :incidence-set #{:act-18620}},
 :node-18621
 {:tpn-type :state,
  :uid :node-18621,
  :constraints #{},
  :activities #{:act-18620},
  :incidence-set #{:act-18628}},
 :act-18639
 {:tpn-type :null-activity, :uid :act-18639, :end-node :node-18555},
 :node-18602
 {:tpn-type :state,
  :uid :node-18602,
  :constraints #{},
  :activities #{:act-18601},
  :incidence-set #{:act-18624}},
 :cnstr-18571
 {:tpn-type :temporal-constraint,
  :uid :cnstr-18571,
  :value [0 3],
  :end-node :node-18570},
 :act-18588
 {:constraints #{:cnstr-18587},
  :non-primitive false,
  :plantid "",
  :uid :act-18588,
  :name "move-medium-res-images",
  :tpn-type :activity,
  :plant "plant",
  :command "move-medium-res-images",
  :reward 0,
  :end-node :node-18586,
  :cost 0},
 :net-18645
 {:tpn-type :network,
  :uid :net-18645,
  :begin-node :node-18638,
  :end-node :node-18637},
 :cnstr-18608
 {:tpn-type :temporal-constraint,
  :uid :cnstr-18608,
  :value [0 10],
  :end-node :node-18607},
 :node-18622
 {:tpn-type :p-end,
  :uid :node-18622,
  :activities #{:act-18635},
  :incidence-set #{:act-18627 :act-18625 :act-18629}},
 :node-18591
 {:tpn-type :c-end,
  :uid :node-18591,
  :activities #{:act-18634},
  :incidence-set #{:act-18598 :act-18596 :act-18594},
  :constraints #{:cnstr-18646}},
 :node-18606
 {:tpn-type :state,
  :uid :node-18606,
  :constraints #{},
  :activities #{:act-18605},
  :incidence-set #{:act-18614}},
 :act-18640
 {:tpn-type :null-activity, :uid :act-18640, :end-node :node-18637},
 :act-18617
 {:tpn-type :null-activity, :uid :act-18617, :end-node :node-18611},
 :cnstr-18631
 {:tpn-type :temporal-constraint,
  :uid :cnstr-18631,
  :value [0 5],
  :end-node :node-18630},
 :node-18559
 {:tpn-type :state,
  :uid :node-18559,
  :constraints #{:cnstr-18647},
  :activities #{:act-18558},
  :incidence-set #{:act-18566}},
 :cnstr-18579
 {:tpn-type :temporal-constraint,
  :uid :cnstr-18579,
  :value [0 3],
  :end-node :node-18578},
 :cnstr-18649
 {:tpn-type :temporal-constraint,
  :uid :cnstr-18649,
  :value [0 3],
  :end-node :node-18556,
  :between-ends [:process :watch-right]},
 :act-18594
 {:tpn-type :null-activity, :uid :act-18594, :end-node :node-18591},
 :cnstr-18553
 {:tpn-type :temporal-constraint,
  :uid :cnstr-18553,
  :value [160 170],
  :end-node :node-18552},
 :node-18552
 {:tpn-type :state,
  :uid :node-18552,
  :constraints #{},
  :activities #{:act-18640},
  :incidence-set #{:act-18554}},
 :node-18556
 {:tpn-type :state,
  :uid :node-18556,
  :constraints #{},
  :activities #{:act-18567},
  :incidence-set #{:act-18558}},
 :act-18644
 {:tpn-type :null-activity, :uid :act-18644, :end-node :node-18637},
 :node-18610
 {:tpn-type :state,
  :uid :node-18610,
  :constraints #{},
  :activities #{:act-18609},
  :incidence-set #{:act-18616}},
 :act-18635
 {:tpn-type :null-activity, :uid :act-18635, :end-node :node-18633},
 :cnstr-18600
 {:tpn-type :temporal-constraint,
  :uid :cnstr-18600,
  :value [0 6],
  :end-node :node-18599},
 :act-18629
 {:tpn-type :null-activity, :uid :act-18629, :end-node :node-18622},
 :node-18574
 {:tpn-type :state,
  :uid :node-18574,
  :constraints #{},
  :activities #{:act-18594},
  :incidence-set #{:act-18576}},
 :node-18582
 {:tpn-type :state,
  :uid :node-18582,
  :constraints #{},
  :activities #{:act-18588},
  :incidence-set #{:act-18584}},
 :act-18615
 {:tpn-type :null-activity, :uid :act-18615, :end-node :node-18611},
 :node-18586
 {:tpn-type :state,
  :uid :node-18586,
  :constraints #{},
  :activities #{:act-18598},
  :incidence-set #{:act-18588}},
 :node-18592
 {:constraints #{:cnstr-18636},
  :uid :node-18592,
  :tpn-type :c-begin,
  :end-node :node-18591,
  :label :acquire,
  :sequence-label :process,
  :activities #{:act-18593 :act-18597 :act-18595},
  :incidence-set #{:act-18643},
  :sequence-end :node-18630},
 :node-18562
 {:tpn-type :state,
  :uid :node-18562,
  :constraints #{},
  :activities #{:act-18561},
  :incidence-set #{:act-18568}},
 :cnstr-18590
 {:tpn-type :temporal-constraint,
  :uid :cnstr-18590,
  :value [78 90],
  :end-node :node-18586},
 :node-18603
 {:tpn-type :state,
  :uid :node-18603,
  :constraints #{},
  :activities #{:act-18615},
  :incidence-set #{:act-18605}}}