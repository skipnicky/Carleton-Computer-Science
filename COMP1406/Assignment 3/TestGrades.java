package comp1406a3;

public class TestGrades{
	public static void main(String[] args){GradesTestCase[] idc = makeTestCases();}
	/** Generate test cases for the Grades class.
		* @return an array of test cases for the Grades class
		*/
	public static GradesTestCase[] makeTestCases(){
		double[][] params = {
		{98.0, 97.0, 98.0, 98.0, 93.0, 94.0, 100.0, 92.0, 92.0},
		{96.0, 95.0, 99.0, 100.0, 98.0, 95.0, 99.0, 95.0, 92.0, 98.0},
		{92.0, 96.0, 95.0}
	  };
		double f = 90;
		Grades g = new Grades(params[0], params[2], params[1],f);
		String lg = g.finalGrade();
		boolean p = g.canProgressTo2ndYear();
		System.out.println(lg + p);
		GradesTestCase testcase = new GradesTestCase(params[0], params[2], params[1], f, lg, p);

		params = new double[][]{
		{0,0,0,0,0,0,0,0,0},
		{0,0,0,0,0,0,0,0,0,0},
		{0,0,0}
		};
		f = 0;
		g = new Grades(params[0], params[2], params[1],f);
		lg = g.finalGrade();
		p = g.canProgressTo2ndYear();

		GradesTestCase testcase2 = new GradesTestCase(params[0], params[2], params[1], f, lg, p);

		params = new double[][]{
		{98.0, 97.0, 98.0, 93.0, 94.0, 100.0, 92.0, 92.0,70.0},
		{96.0, 95.0, 99.0, 100.0, 98.0, 95.0, 99.0, 95.0, 92.0, 98.0},
		{92.0, 96.0, 95.0}
		};
		f = 0;
		g = new Grades(params[0], params[2], params[1],f);
		lg = g.finalGrade();
		p = g.canProgressTo2ndYear();
		System.out.println("K" +lg + p);
		GradesTestCase testcase3 = new GradesTestCase(params[0], params[2], params[1], f, lg, p);

		params = new double[][]{
		{33.0, 58.0, 24.0, 49.0, 41.0, 16.0, 39.0, 17.0, 56.0},
		{25.0, 55.0, 35.0, 31.0, 39.0, 21.0, 17.0, 25.0, 53.0, 43.0},
		{53.0, 57.0, 41.0}
		};
		f = 94.8;
		//59.9 --> D+ false
		g = new Grades(params[0], params[2], params[1],f);
		lg = g.finalGrade();
		p = g.canProgressTo2ndYear();
		System.out.println(lg + p);
		GradesTestCase testcase5 = new GradesTestCase(params[0], params[2], params[1], f, lg, p);

		params = new double[][]{
		{80,80,80,80,80,80,80,80,80},
		{80,80,80,80,80,80,80,80,80,80},
		{80,0,80}
		};
		f = 80;
		g = new Grades(params[0], params[2], params[1],f);
		lg = g.finalGrade();
		p = g.canProgressTo2ndYear();
		System.out.println(lg + p);
		GradesTestCase testcase6 = new GradesTestCase(params[0], params[2], params[1], f, lg, p);

		params = new double[][]{
		{80,80,80,80,80,80,80,80,80},
		{80,80,80,80,80,80,80,80,0,0},
		{80,80,80}
		};
		f = 80;
		g = new Grades(params[0], params[2], params[1],f);
		lg = g.finalGrade();
		p = g.canProgressTo2ndYear();
		GradesTestCase testcase7 = new GradesTestCase(params[0], params[2], params[1], f, lg, p);

		params = new double[][]{
		{80,80,80,80,80,80,80,80,0},
		{80,80,80,80,80,80,80,80,80,80},
		{80,80,80}
		};
		f = 80;
		g = new Grades(params[0], params[2], params[1],f);
		lg = g.finalGrade();
		p = g.canProgressTo2ndYear();
		GradesTestCase testcase8 = new GradesTestCase(params[0], params[2], params[1], f, lg, p);

		params = new double[][]{
		{80,80,80,80,80,80,90,90,90},
		{80,80,80,80,80,80,80,80,80,80},
		{80,75,75}
		};
		f = 80;
		g = new Grades(params[0], params[2], params[1],f);
		lg = g.finalGrade();
		p = g.canProgressTo2ndYear();
		System.out.println(lg + p);
		GradesTestCase testcase9 = new GradesTestCase(params[0], params[2], params[1], f, lg, p);

		params = new double[][]{
		{91.0, 96.0, 92.0, 97.0, 99.0, 95.0, 100.0, 100.0, 95.0},
		{98.0, 96.0, 98.0, 95.0, 91.0, 100.0, 97.0, 92.0, 98.0, 100.0},
		{100.0, 93.0, 98.0}
		};
		f = 56.6;
		//85 --> A true
		g = new Grades(params[0], params[2], params[1],f);
		lg = g.finalGrade();
		p = g.canProgressTo2ndYear();
		System.out.println(lg + p);
		GradesTestCase testcase10 = new GradesTestCase(params[0], params[2], params[1], f, lg, p);

		params = new double[][]{
		{56.0, 42.0, 23.0, 58.0, 34.0, 15.0, 46.0, 21.0, 17.0},
		{36.0, 52.0, 28.0, 34.0, 25.0, 20.0, 32.0, 33.0, 32.0, 37.0},
		{42.0, 16.0, 23.0}
		};
		f = 94.5;
		g = new Grades(params[0], params[2], params[1],f);
		lg = g.finalGrade();
		p = g.canProgressTo2ndYear();
		System.out.println(lg + p);
		GradesTestCase testcase11 = new GradesTestCase(params[0], params[2], params[1], f, lg, p);

		params = new double[][]{
		{72.0, 79.0, 78.0, 65.0, 72.0, 75.0, 66.0, 74.0, 66.0},
		{79.0, 65.0, 69.0, 79.0, 77.0, 68.0, 65.0, 75.0, 73.0, 69.0},
		{65.0, 78.0, 73.0}
		};
		f = 24.5;
		//59.34
		g = new Grades(params[0], params[2], params[1],f);
		lg = g.finalGrade();
		p = g.canProgressTo2ndYear();
		System.out.println(lg + p);
		GradesTestCase testcase12 = new GradesTestCase(params[0], params[2], params[1], f, lg, p);

		params = new double[][]{
		{96.0, 99.0, 97.0, 99.0, 98.0, 93.0, 98.0, 95.0, 97.0},
		{91.0, 94.0, 100.0, 97.0, 92.0, 91.0, 100.0, 92.0, 99.0, 91.0},
		{94.0, 91.0, 96.0}
		};
		f = 75.999;
		g = new Grades(params[0], params[2], params[1],f);
		lg = g.finalGrade();
		p = g.canProgressTo2ndYear();
		System.out.println(lg + p);
		GradesTestCase testcase13 = new GradesTestCase(params[0], params[2], params[1], f, lg, p);

		params = new double[][]{
		{15.0, 50.0, 35.0, 27.0, 55.0, 19.0, 29.0, 42.0, 26.0},
		{46.0, 20.0, 57.0, 50.0, 16.0, 51.0, 42.0, 50.0, 59.0, 38.0},
		{54.0, 59.0, 20.0}
		};
		f = 61.2;
		g = new Grades(params[0], params[2], params[1],f);
		lg = g.finalGrade();
		p = g.canProgressTo2ndYear();
		GradesTestCase testcase14 = new GradesTestCase(params[0], params[2], params[1], f, lg, p);

		params = new double[][]{
		{73.0, 70.0, 68.0, 70.0, 65.0, 75.0, 71.0, 65.0, 79.0},
		{74.0, 77.0, 75.0, 76.0, 73.0, 72.0, 72.0, 66.0, 72.0, 75.0},
		{66.0, 71.0, 67.0}
		};
		f = 31.4;
		g = new Grades(params[0], params[2], params[1],f);
		lg = g.finalGrade();
		p = g.canProgressTo2ndYear();
		System.out.println(lg + p);
		GradesTestCase testcase15 = new GradesTestCase(params[0], params[2], params[1], f, lg, p);

		params = new double[][]{
		{90.0, 92.0, 95.0, 91.0, 90.0, 94.0, 93.0, 99.0, 99.0},
		{97.0, 91.0, 92.0, 97.0, 100.0, 98.0, 95.0, 94.0, 93.0, 96.0},
		{91.0, 92.0, 92.0}
		};
		f = 83.73;
		g = new Grades(params[0], params[2], params[1],f);
		lg = g.finalGrade();
		p = g.canProgressTo2ndYear();
		GradesTestCase testcase16 = new GradesTestCase(params[0], params[2], params[1], f, lg, p);

		params = new double[][]{
		{47.0, 29.0, 51.0, 39.0, 57.0, 26.0, 52.0, 27.0, 59.0},
		{19.0, 22.0, 16.0, 51.0, 19.0, 57.0, 51.0, 17.0, 35.0, 31.0},
		{36.0, 31.0, 35.0}
		};
		f = 99.8;
		g = new Grades(params[0], params[2], params[1],f);
		lg = g.finalGrade();
		p = g.canProgressTo2ndYear();
		GradesTestCase testcase17 = new GradesTestCase(params[0], params[2], params[1], f, lg, p);

		params = new double[][]{
		{66.0, 75.0, 78.0, 78.0, 76.0, 78.0, 73.0, 76.0, 77.0},
		{78.0, 77.0, 67.0, 74.0, 66.0, 65.0, 77.0, 75.0, 67.0, 66.0},
		{79.0, 72.0, 75.0}
		};
		f = 22.999;
		g = new Grades(params[0], params[2], params[1],f);
		lg = g.finalGrade();
		p = g.canProgressTo2ndYear();
		GradesTestCase testcase18 = new GradesTestCase(params[0], params[2], params[1], f, lg, p);

		params = new double[][]{
		{70.0, 78.0, 71.0, 66.0, 65.0, 73.0, 79.0, 75.0, 75.0},
		{77.0, 72.0, 72.0, 71.0, 75.0, 71.0, 79.0, 73.0, 68.0, 75.0},
		{65.0, 73.0, 70.0}
		};
		f = 28.4;
		g = new Grades(params[0], params[2], params[1],f);
		lg = g.finalGrade();
		p = g.canProgressTo2ndYear();
		GradesTestCase testcase19 = new GradesTestCase(params[0], params[2], params[1], f, lg, p);

		params = new double[][]{
		{72.0, 79.0, 78.0, 65.0, 72.0, 75.0, 66.0, 74.0, 66.0},
		{79.0, 65.0, 69.0, 79.0, 77.0, 68.0, 65.0, 75.0, 73.0, 69.0},
		{66.0, 78.0, 73.0}
		};
		f = 24.500000000000003;
		g = new Grades(params[0], params[2], params[1],f);
		lg = g.finalGrade();
		p = g.canProgressTo2ndYear();
		GradesTestCase testcase20 = new GradesTestCase(params[0], params[2], params[1], f, lg, p);

		params = new double[][]{
		{72.0, 79.0, 78.0, 65.0, 72.0, 75.0, 66.0, 74.0, 66.0},
		{79.0, 65.0, 69.0, 79.0, 77.0, 68.0, 65.0, 75.0, 73.0, 69.0},
		{66.0, 78.0, 90.0}
		};
		f = 0.00000000001;
		g = new Grades(params[0], params[2], params[1],f);
		lg = g.finalGrade();
		p = g.canProgressTo2ndYear();
		GradesTestCase testcase21 = new GradesTestCase(params[0], params[2], params[1], f, lg, p);

		params = new double[][]{
			{0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0},
			{100,100,100}
		};
		f = 100;
		g = new Grades(params[0], params[2], params[1],f);
		lg = g.finalGrade();
		p = g.canProgressTo2ndYear();
		GradesTestCase testcase22 = new GradesTestCase(params[0], params[2], params[1], f, lg, p);

		params = new double[][]{
		{100,100,100,100,100,100,100,100,100},
		{100,100,100,100,100,100,100,100,100,100},
		{0,0,0}
		};
		f = 100;
		g = new Grades(params[0], params[2], params[1],f);
		lg = g.finalGrade();
		p = g.canProgressTo2ndYear();
		GradesTestCase testcase23 = new GradesTestCase(params[0], params[2], params[1], f, lg, p);

		params = new double[][]{
		{76.093624,39.276789,70.006614,94.593690,70.799395,55.982506,3.170759,65.370878,91.545927},
		{77.538931,52.700207,50.557710,18.969513,13.443172,54.154764,28.438000,71.919078,9.108490,4.237349},
		{52.982156,28.220455,16.448273}
		};
		f = 0;
		g = new Grades(params[0], params[2], params[1],f);
		lg = g.finalGrade();
		p = g.canProgressTo2ndYear();
		GradesTestCase testcase0 = new GradesTestCase(params[0], params[2], params[1], f, lg, p);

		params = new double[][]{
		{1.079280,73.527592,78.322410,71.220106,79.259192,69.140409,73.394874,72.529997,66.529906},
		{24.329482,41.692076,16.680908,9.193093,92.279012,18.101476,6.967602,78.881957,51.553577,89.323785},
		{93.944148,26.755447,67.557531}
		};
		f = 0;
		g = new Grades(params[0], params[2], params[1],f);
		lg = g.finalGrade();
		p = g.canProgressTo2ndYear();
		GradesTestCase testcase24 = new GradesTestCase(params[0], params[2], params[1], f, lg, p);

		params = new double[][]{
		{35.073043,13.645104,63.132375,30.332060,92.298308,76.271631,82.115785,23.326032,72.914997},
		{30.836161,94.496235,21.957928,66.966288,27.849896,35.679056,22.235524,81.113703,28.788534,1.561518},
		{79.079360,22.314757,44.069888}
		};
		f = 0;
		g = new Grades(params[0], params[2], params[1],f);
		lg = g.finalGrade();
		p = g.canProgressTo2ndYear();
		GradesTestCase testcase25 = new GradesTestCase(params[0], params[2], params[1], f, lg, p);

		params = new double[][]{
		{92.0, 93.0, 99.0, 98.0, 98.0, 99.0, 99.0, 98.0, 95.0},
		{93.0, 92.0, 90.0, 91.0, 94.0, 90.0, 100.0, 92.0, 99.0, 98.0},
		{96.0, 90.0, 98.0}
		};
		f = 57.96666666666671;
		g = new Grades(params[0], params[2], params[1],f);
		lg = g.finalGrade();
		p = g.canProgressTo2ndYear();
		GradesTestCase testcase26 = new GradesTestCase(params[0], params[2], params[1], f, lg, p);

		params = new double[][]{
		{55.0, 35.0, 37.0, 47.0, 58.0, 50.0, 35.0, 38.0, 48.0},
		{48.0, 50.0, 49.0, 21.0, 40.0, 44.0, 26.0, 35.0, 18.0, 18.0},
		{20.0, 37.0, 49.0}
		};
		f = 86.69999999999999;
		g = new Grades(params[0], params[2], params[1],f);
		lg = g.finalGrade();
		p = g.canProgressTo2ndYear();
		GradesTestCase testcase27 = new GradesTestCase(params[0], params[2], params[1], f, lg, p);

		params = new double[][]{
		{72.0, 74.0, 70.0, 67.0, 76.0, 77.0, 79.0, 71.0, 65.0},
		{75.0, 68.0, 72.0, 77.0, 68.0, 76.0, 67.0, 69.0, 77.0, 67.0},
		{66.0, 75.0, 72.0}
		};
		f = 26.499999999999996;
		g = new Grades(params[0], params[2], params[1],f);
		lg = g.finalGrade();
		p = g.canProgressTo2ndYear();
		GradesTestCase testcase31 = new GradesTestCase(params[0], params[2], params[1], f, lg, p);

		params = new double[][]{
		{95.0, 92.0, 95.0, 93.0, 95.0, 90.0, 99.0, 99.0, 94.0},
		{98.0, 100.0, 93.0, 98.0, 96.0, 93.0, 98.0, 95.0, 95.0, 91.0},
		{93.0, 94.0, 99.0}
		};
		f = 44.46666666666668;
		g = new Grades(params[0], params[2], params[1],f);
		lg = g.finalGrade();
		p = g.canProgressTo2ndYear();
		GradesTestCase testcase28 = new GradesTestCase(params[0], params[2], params[1], f, lg, p);

		params = new double[][]{
		{38.0, 48.0, 41.0, 48.0, 35.0, 23.0, 58.0, 57.0, 49.0},
		{55.0, 45.0, 17.0, 30.0, 28.0, 30.0, 30.0, 38.0, 18.0, 38.0},
		{53.0, 52.0, 21.0}
		};
		f = 71.7;
		g = new Grades(params[0], params[2], params[1],f);
		lg = g.finalGrade();
		p = g.canProgressTo2ndYear();
		GradesTestCase testcase29 = new GradesTestCase(params[0], params[2], params[1], f, lg, p);

		params = new double[][]{
		{78.0, 77.0, 76.0, 71.0, 67.0, 73.0, 76.0, 74.0, 73.0},
		{72.0, 79.0, 75.0, 72.0, 76.0, 78.0, 68.0, 79.0, 79.0, 66.0},
		{66.0, 73.0, 72.0}
		};
		f = 28.499999999999993;
		g = new Grades(params[0], params[2], params[1],f);
		lg = g.finalGrade();
		p = g.canProgressTo2ndYear();
		GradesTestCase testcase30 = new GradesTestCase(params[0], params[2], params[1], f, lg, p);

		//new
		params = new double[][]{
		{65.863040,48.175766,25.688950,97.054361,14.557310,68.771570,11.567437,82.796160,38.526239},
		{71.758788,66.799814,14.674439,96.960177,83.443210,23.023620,39.103501,83.373862,25.790150,69.878571},
		{12.013749,28.883019,42.439110}
		};
		f = 0;
		g = new Grades(params[0], params[2], params[1],f);
		lg = g.finalGrade();
		p = g.canProgressTo2ndYear();
		GradesTestCase testcase34 = new GradesTestCase(params[0], params[2], params[1], f, lg, p);


		params = new double[][]{
		{97.589292,75.607094,95.493892,99.931571,2.593406,30.106080,73.609681,49.878921,11.098905},
		{86.094471,27.929819,27.723218,8.701156,63.612827,77.805424,81.740818,71.941292,35.385104,54.501315},
		{94.062628,38.887449,58.545214}
		};
		f = 0;
		g = new Grades(params[0], params[2], params[1],f);
		lg = g.finalGrade();
		p = g.canProgressTo2ndYear();
		GradesTestCase testcase32 = new GradesTestCase(params[0], params[2], params[1], f, lg, p);


		params = new double[][]{
		{71.940769,3.879711,28.603603,75.660098,20.763548,20.371969,73.882312,17.467514,55.539535},
		{32.417822,13.197839,87.829584,7.613517,62.252043,4.158720,39.440077,35.415363,51.541157,78.382154},
		{28.026833,53.111461,88.164599}
		};
		f = 0;
		g = new Grades(params[0], params[2], params[1],f);
		lg = g.finalGrade();
		p = g.canProgressTo2ndYear();
		GradesTestCase testcase33 = new GradesTestCase(params[0], params[2], params[1], f, lg, p);

		//new
		params = new double[][]{
		{17.0, 17.0, 48.0, 59.0, 38.0, 52.0, 26.0, 57.0, 23.0},
		{25.0, 26.0, 22.0, 37.0, 26.0, 41.0, 55.0, 20.0, 57.0, 22.0},
		{21.0, 25.0, 54.0}
		};
		f = 100;
		g = new Grades(params[0], params[2], params[1],f);
		lg = g.finalGrade();
		p = g.canProgressTo2ndYear();
		GradesTestCase testcase35 = new GradesTestCase(params[0], params[2], params[1], f, lg, p);

		params = new double[][]{
		{73.0, 78.0, 66.0, 79.0, 66.0, 79.0, 78.0, 69.0, 70.0},
		{68.0, 68.0, 67.0, 79.0, 65.0, 73.0, 68.0, 68.0, 65.0, 72.0},
		{68.0, 78.0, 75.0}
		};
		f = 26.3;
		g = new Grades(params[0], params[2], params[1],f);
		lg = g.finalGrade();
		p = g.canProgressTo2ndYear();
		GradesTestCase testcase36 = new GradesTestCase(params[0], params[2], params[1], f, lg, p);

		params = new double[][]{
		{100.0, 94.0, 93.0, 98.0, 96.0, 91.0, 94.0, 94.0, 90.0},
		{97.0, 99.0, 99.0, 91.0, 96.0, 92.0, 90.0, 97.0, 99.0, 93.0},
		{91.0, 95.0, 97.0}
		};
		f = 43.333333333333336;
		g = new Grades(params[0], params[2], params[1],f);
		lg = g.finalGrade();
		p = g.canProgressTo2ndYear();
		GradesTestCase testcase37 = new GradesTestCase(params[0], params[2], params[1], f, lg, p);

		params = new double[][]{
		{85.0, 85.0, 85.0, 85.0, 85.0, 85.0, 85.0, 85.0, 85.0},
		{85.0, 85.0, 85.0, 85.0, 85.0, 85.0, 85.0, 85.0, 85.0, 85.0},
		{85.0, 85.0, 85.0}
		};
		f = 85;
		g = new Grades(params[0], params[2], params[1],f);
		lg = g.finalGrade();
		p = g.canProgressTo2ndYear();
		GradesTestCase testcase38 = new GradesTestCase(params[0], params[2], params[1], f, lg, p);

		params = new double[][]{
		{90.0, 90.0, 90.0, 90.0, 90.0, 90.0, 90.0, 90.0, 90.0},
		{90.0, 90.0, 90.0, 90.0, 90.0, 90.0, 90.0, 90.0, 90.0, 90.0},
		{90.0, 90.0, 90.0}
		};
		f = 90.0;
		g = new Grades(params[0], params[2], params[1],f);
		lg = g.finalGrade();
		p = g.canProgressTo2ndYear();
		GradesTestCase testcase39 = new GradesTestCase(params[0], params[2], params[1], f, lg, p);

		params = new double[][]{
		{70.0, 70.0, 70.0, 70.0, 70.0, 70.0, 70.0, 70.0, 70.0},
		{70.0, 70.0, 70.0, 70.0, 70.0, 70.0, 70.0, 70.0, 70.0, 70.0},
		{70.0, 70.0, 70.0}
		};
		f = 70;
		g = new Grades(params[0], params[2], params[1],f);
		lg = g.finalGrade();
		p = g.canProgressTo2ndYear();
		GradesTestCase testcase40 = new GradesTestCase(params[0], params[2], params[1], f, lg, p);

		params = new double[][]{
		{80.0, 80.0, 80.0, 80.0, 80.0, 80.0, 80.0, 80.0, 80.0},
		{80.0, 80.0, 80.0, 80.0, 80.0, 80.0, 80.0, 80.0, 80.0, 80.0},
		{80.0, 80.0, 80.0}
		};
		f = 80;
		g = new Grades(params[0], params[2], params[1],f);
		lg = g.finalGrade();
		p = g.canProgressTo2ndYear();
		GradesTestCase testcase41 = new GradesTestCase(params[0], params[2], params[1], f, lg, p);

		params = new double[][]{
		{77.0, 77.0, 77.0, 77.0, 77.0, 77.0, 77.0, 77.0, 77.0},
		{77.0, 77.0, 77.0, 77.0, 77.0, 77.0, 77.0, 77.0, 77.0, 77.0},
		{77.0, 77.0, 77.0}
		};
		f = 77;
		g = new Grades(params[0], params[2], params[1],f);
		lg = g.finalGrade();
		p = g.canProgressTo2ndYear();
		GradesTestCase testcase42 = new GradesTestCase(params[0], params[2], params[1], f, lg, p);

		params = new double[][]{
		{73.0, 73.0, 73.0, 73.0, 73.0, 73.0, 73.0, 73.0, 73.0},
		{73.0, 73.0, 73.0, 73.0, 73.0, 73.0, 73.0, 73.0, 73.0, 73.0},
		{73.0, 73.0, 73.0}
		};
		f = 73;
		g = new Grades(params[0], params[2], params[1],f);
		lg = g.finalGrade();
		p = g.canProgressTo2ndYear();
		GradesTestCase testcase43 = new GradesTestCase(params[0], params[2], params[1], f, lg, p);

		params = new double[][]{
		{67.0, 67.0, 67.0, 67.0, 67.0, 67.0, 67.0, 67.0, 67.0},
		{67.0, 67.0, 67.0, 67.0, 67.0, 67.0, 67.0, 67.0, 67.0, 67.0},
		{67.0, 67.0, 67.0}
		};
		f = 67;
		g = new Grades(params[0], params[2], params[1],f);
		lg = g.finalGrade();
		p = g.canProgressTo2ndYear();
		GradesTestCase testcase44 = new GradesTestCase(params[0], params[2], params[1], f, lg, p);

		params = new double[][]{
		{63.0, 63.0, 63.0, 63.0, 63.0, 63.0, 63.0, 63.0, 63.0},
		{63.0, 63.0, 63.0, 63.0, 63.0, 63.0, 63.0, 63.0, 63.0, 63.0},
		{63.0, 63.0, 63.0}
		};
		f = 63;
		g = new Grades(params[0], params[2], params[1],f);
		lg = g.finalGrade();
		p = g.canProgressTo2ndYear();
		GradesTestCase testcase45 = new GradesTestCase(params[0], params[2], params[1], f, lg, p);

		params = new double[][]{
		{60.0, 60.0, 60.0, 60.0, 60.0, 60.0, 60.0, 60.0, 60.0},
		{60.0, 60.0, 60.0, 60.0, 60.0, 60.0, 60.0, 60.0, 60.0, 60.0},
		{60.0, 60.0, 60.0}
		};
		f = 60;
		g = new Grades(params[0], params[2], params[1],f);
		lg = g.finalGrade();
		p = g.canProgressTo2ndYear();
		GradesTestCase testcase46 = new GradesTestCase(params[0], params[2], params[1], f, lg, p);

		params = new double[][]{
		{57.0, 57.0, 57.0, 57.0, 57.0, 57.0, 57.0, 57.0, 57.0},
		{57.0, 57.0, 57.0, 57.0, 57.0, 57.0, 57.0, 57.0, 57.0, 57.0},
		{57.0, 57.0, 57.0}
		};
		f = 57;
		g = new Grades(params[0], params[2], params[1],f);
		lg = g.finalGrade();
		p = g.canProgressTo2ndYear();
		GradesTestCase testcase47 = new GradesTestCase(params[0], params[2], params[1], f, lg, p);

		params = new double[][]{
		{53.0, 53.0, 53.0, 53.0, 53.0, 53.0, 53.0, 53.0, 53.0},
		{53.0, 53.0, 53.0, 53.0, 53.0, 53.0, 53.0, 53.0, 53.0, 53.0},
		{53.0, 53.0, 53.0}
		};
		f = 53;
		g = new Grades(params[0], params[2], params[1],f);
		lg = g.finalGrade();
		p = g.canProgressTo2ndYear();
		GradesTestCase testcase48 = new GradesTestCase(params[0], params[2], params[1], f, lg, p);

		params = new double[][]{
		{50.0, 50.0, 50.0, 50.0, 50.0, 50.0, 50.0, 50.0, 50.0},
		{50.0, 50.0, 50.0, 50.0, 50.0, 50.0, 50.0, 50.0, 50.0, 50.0},
		{50.0, 50.0, 50.0}
		};
		f = 50;
		g = new Grades(params[0], params[2], params[1],f);
		lg = g.finalGrade();
		p = g.canProgressTo2ndYear();
		GradesTestCase testcase50 = new GradesTestCase(params[0], params[2], params[1], f, lg, p);

		params = new double[][]{
		{100.0, 100.0, 100.0, 100.0, 100.0, 100.0, 100.0, 100.0, 100.0},
		{100.0, 100.0, 100.0, 100.0, 100.0, 100.0, 100.0, 100.0, 100.0, 100.0},
		{100.0, 100.0, 100.0}
		};
		f = 100;
		g = new Grades(params[0], params[2], params[1],f);
		lg = g.finalGrade();
		p = g.canProgressTo2ndYear();
		GradesTestCase testcase49 = new GradesTestCase(params[0], params[2], params[1], f, lg, p);

		//

		params = new double[][]{
		{0,0,0,0,0,0,0,1,1},
		{0,0,0,0,0,0,0,0,0,0},
		{0,0,0}
		};
		f = 0;
		g = new Grades(params[0], params[2], params[1],f);
		lg = g.finalGrade();
		p = g.canProgressTo2ndYear();
		GradesTestCase testcase51 = new GradesTestCase(params[0], params[2], params[1], f, lg, p);
		
		params = new double[][]{
		{100.0, 100.0, 100.0, 100.0, 100.0, 100.0, 100.0, 100.0, 0},
		{100.0, 100.0, 100.0, 100.0, 100.0, 100.0, 100.0, 100.0, 0, 0},
		{100.0, 100.0, 0}
		};
		f = 100;
		g = new Grades(params[0], params[2], params[1],f);
		lg = g.finalGrade();
		p = g.canProgressTo2ndYear();
		GradesTestCase testcase52 = new GradesTestCase(params[0], params[2], params[1], f, lg, p);
		System.out.println(p + lg);
		params = new double[][]{
		{100.0, 100.0, 100.0, 100.0, 100.0, 100.0, 100.0, 100.0, 100.0},
		{100.0, 100.0, 100.0, 100.0, 100.0, 100.0, 100.0, 100.0, 100.0, 100.0},
		{0, 0, 0}
		};
		f = 100;
		g = new Grades(params[0], params[2], params[1],f);
		lg = g.finalGrade();
		p = g.canProgressTo2ndYear();
		GradesTestCase testcase53 = new GradesTestCase(params[0], params[2], params[1], f, "F", false);

		params = new double[][]{
		{100.0, 100.0, 100.0, 100.0, 100.0, 100.0, 100.0, 100.0, 100.0},
		{100.0, 100.0, 100.0, 100.0, 100.0, 100.0, 100.0, 100.0, 100.0, 100.0},
		{100.0, 100.0, 100.0}
		};
		f = 100;
		g = new Grades(params[0], params[2], params[1],f);
		lg = g.finalGrade();
		p = g.canProgressTo2ndYear();
		GradesTestCase testcase54 = new GradesTestCase(params[0], params[2], params[1], f, "F", false);

		params = new double[][]{
		{60.0, 60.0, 60.0, 60.0, 60.0, 60.0, 60.0, 60.0, 60.0},
		{60.0, 60.0, 60.0, 60.0, 60.0, 60.0, 60.0, 60.0, 60.0, 60.0},
		{60.0, 60.0, 60.0}
		};
		f = 59;
		g = new Grades(params[0], params[2], params[1],f);
		lg = g.finalGrade();
		p = g.canProgressTo2ndYear();
		GradesTestCase testcase55 = new GradesTestCase(params[0], params[2], params[1], f, "D+", false);

		GradesTestCase[] cases = {testcase0,testcase,testcase2,testcase3,testcase5,testcase6,testcase7,testcase8,
		testcase9, testcase10, testcase11, testcase12, testcase13, testcase14,testcase15,testcase16,
	  testcase17, testcase18,testcase19,testcase20,testcase21,testcase22,testcase23,testcase24,testcase25,
		testcase26, testcase27, testcase28, testcase29,testcase30,testcase31,testcase32,testcase33,testcase34,testcase35,testcase36,
	  testcase37, testcase38, testcase39, testcase40,testcase41,testcase42,testcase43,testcase44,testcase45,
		testcase46,testcase47,testcase48,testcase49,testcase50,testcase51,testcase52,testcase53,testcase54,testcase55};

		return cases;
	}
}
