public class Card_list {
    int[] cardlist=new int[100];
    //취약 -부여하면 적에게 30% 데미지가 들어간다.
    //약화 -부여하면 적의 공격이 30% 약해진다.

    //새로 뽑은카드가 두번째부터 사용이 안됨--해결
    //적 둘 이상시 누구 공격할지 출력안됨--해결
    //첫 번째 적만 죽어도 게임이 종료됨--해결
    //상점 중복 카드수정--해결

    //적이 죽고 체력 마이너스 표기 오류 수정
    //내 턴이 안끝났는데 적1이 죽고나서 적2의 턴으로 바로 넘어가는 오류
    //내가 삭제한 카드가 다음 던전에서 다시 생기는 오류
    //+취약 약화 표기

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
        //[스킬0]격노. 이번 턴에 데미지를 줄 때마다 방어도가 3씩 증가한다.
        cardlist[10]=10;
        //[스킬0] 진정한 끈기. 방어도를 7얻습니다. 무작위로 패 한장을 버립니다.

    }



}
