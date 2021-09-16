package model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class GridTest {
  private Grid grid;

  @BeforeEach
  public void initializeGrid(){
    grid = new Grid(3,3);
  }

  @Test
  public void testGetNeighbours(){
    assertThat(grid.getNeighbours(1,1), is(notNullValue()));
    assertThat(grid.getNeighbours(1,1), hasSize(equalTo(8)));
    assertThat(grid.getNeighbours(1,1),
            containsInAnyOrder(grid.getCell(0,0),
                    grid.getCell(0,1),
                    grid.getCell(0,2),
                    grid.getCell(1,0),
                    grid.getCell(1,2),
                    grid.getCell(2,0),
                    grid.getCell(2,1),
                    grid.getCell(2,2)));
  }

  @Test
  public void testCountAliveNeighbours(){
    assertThat(grid.countAliveNeighbours(1,1), is(equalTo(0)));
    grid.getCell(2,2).setState(CellState.ALIVE);
    grid.getCell(0,0).setState(CellState.ALIVE);
    assertThat(grid.countAliveNeighbours(1,1), is(equalTo(2)));
  }


}
