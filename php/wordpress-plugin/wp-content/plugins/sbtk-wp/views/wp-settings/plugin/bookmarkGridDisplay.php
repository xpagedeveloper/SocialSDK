<h3>Bookmarks Grid</h3>
Would you like to display a pager? <br/>
<input type="radio" name="bookmark_grid_pager" value="yes" ***REMOVED*** echo ($viewData['bookmark_grid_pager'] == 'yes' ? 'checked="checked"' : '') ?>/> Yes<br/>
<input type="radio" name="bookmark_grid_pager" value="no" ***REMOVED*** echo ($viewData['bookmark_grid_pager'] == 'no' ? 'checked="checked"' : '') ?>/> No<br/>
<br/>
Would you like to display a sorter? <br/>
<input type="radio" name="bookmark_grid_sorter" value="yes" ***REMOVED*** echo ($viewData['bookmark_grid_sorter'] == 'yes' ? 'checked="checked"' : '') ?>/> Yes<br/>
<input type="radio" name="bookmark_grid_sorter" value="no" ***REMOVED*** echo ($viewData['bookmark_grid_sorter'] == 'no' ? 'checked="checked"' : '') ?>/> No<br/>
<br/>
What container type would you like? <br/>
<input type="radio" name="bookmark_grid_container_type" value="ol" ***REMOVED*** echo ($viewData['bookmark_grid_container_type'] == 'ol' ? 'checked="checked"' : '') ?>/> Ordered list<br/>
<input type="radio" name="bookmark_grid_container_type" value="ul" ***REMOVED*** echo ($viewData['bookmark_grid_container_type'] == 'ul' ? 'checked="checked"' : '') ?>/> Unordered list<br/>
<input type="radio" name="bookmark_grid_container_type" value="table" ***REMOVED*** echo ($viewData['bookmark_grid_container_type'] == 'table' ? 'checked="checked"' : '') ?>/> Table<br/>

<input type="hidden" name="bookmark_grid_update" value="1" />