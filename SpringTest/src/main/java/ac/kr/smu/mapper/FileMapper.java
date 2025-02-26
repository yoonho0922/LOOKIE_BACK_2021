package ac.kr.smu.mapper;

import ac.kr.smu.vo.FileVO;

import java.util.List;

public interface FileMapper {
    public void save(FileVO fileVO);
    public FileVO findById(int id);
    public List<FileVO> findByPostId(int postId);
    public void deleteByPostId(int postId);
}