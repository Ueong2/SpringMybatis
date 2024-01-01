package test.emp;

import java.util.List;

public interface EmpDAO {
	//회원가입
	int insert(EmpDTO user);
	//회원정보수정
	int update(EmpDTO userInfo);
	//회원탈퇴
	int delete(String id);
	//로그인
	EmpDTO login(String id,String pass);
	//전체회원목록조회
	List<EmpDTO> getMemberList(); 
	//회원정보조회
	EmpDTO findById(String id);
	//주소로검색하기
	List<EmpDTO> findByAddr(String addr);
	List<EmpDTO> search(String word,String category);
}




