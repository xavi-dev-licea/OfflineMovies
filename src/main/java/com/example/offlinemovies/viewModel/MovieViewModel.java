package com.example.offlinemovies.viewModel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import com.example.offlinemovies.data.MovieRepository;
import com.example.offlinemovies.data.local.entity.MovieEntity;
import com.example.offlinemovies.data.network.Resource;

import java.util.List;

public class MovieViewModel extends ViewModel {

    private final LiveData<Resource<List<MovieEntity>>> popularMovies;
    private MovieRepository repository;

    public MovieViewModel(){
        repository = new MovieRepository();
        popularMovies = repository.getPopularMovies();
    }

    public LiveData<Resource<List<MovieEntity>>> getPopularMovies(){
        return popularMovies;
    }
}
