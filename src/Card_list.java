public class Card_list {
    int[] cardlist=new int[100];
    //취약 -부여하면 적에게 30% 데미지가 들어간다.
    //약화 -부여하면 적의 공격이 40% 약해진다.
    //취약 부여는 항상 코드 마지막에!!!!
        //소용돌이 너프


 //괴물리스트 만들기
    //선물시스템 및 던전 2 스테이지 완성 2-1,2-2 2-골리앗

    public void all_cardlist() {
        cardlist[1]=1;
        //[공격1] 타격1 .피해를 10준다
        cardlist[2]=2;
        //[수비1] 수비 .방어도 8증가
        cardlist[3]=3;
        //[공격1] 강타. 전체 적에게 8만큼 피해를 준다.
        cardlist[4]=4;
        //[공격1] 천둥. 적 전체에게 피해 4주고 취약 1 부여
        cardlist[5]=5;
        //[공격1]혈류. 체력을 2 잃고 피해를 15 준다.
        cardlist[6]=6;
        //[공격1]몸통박치기. 현재 방어도만큼의 피해를 준다.
        cardlist[7]=7;
        //[공격2]어퍼컷. 약화를 2 부여하고 피해를 12 줍니다. -- 약화 해결
        cardlist[8]=8;
        //[스킬0]위압. 적 전체에게 약화를 1 부여한다. -- 적이 존재하지 않는데 약화를 부여하는 오류 후에 오류 발생가능성.
        cardlist[9]=9;
        //[공격1] 철의파동. 피해를 5줍니다. 방어도를 5얻습니다.
        cardlist[10]=10;
        //[ㄱㄱ3]소용돌이⑶: 모든 적들에게 피해를 [10,15,20] 중 무작위로 입힙니다.
        cardlist[11]=11;
        //[공격1] 포식 1코: 피해를 10줍니다. 이 공격으로 적을 죽였으면 체력을 5 회복합니다.
        cardlist[12]=12;
        //공격2 지옥불 2 코 : 덱의 카드를 전부 소멸시킵니다. 소멸시킨 카드 당 7의 데미지를 줍니다.
        cardlist[13]=13;
        // 수비 /참호 1코: 방어도가 2배로 증가합니다.



        cardlist[14]=14;
        //스킬/ 충격파 2코 : 적 전체에게 약화와 취약 3을 부여합니다.
        cardlist[15]=15;
        //수비/ 유령갑옷 1코 ; 방어도를 10얻습니다.
        cardlist[16]=16;
        //스킬/ 무지개반사 2코: 내가 적에게 받았던 피해를 그대로 돌려줍니다.
    }
}
