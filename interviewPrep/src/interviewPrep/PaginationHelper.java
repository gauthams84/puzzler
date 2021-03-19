package interviewPrep;

import java.util.List;

public class PaginationHelper<I> {

	private List<I> collection;
	private int itemsPerPage;

	/**
	 * The constructor takes in an array of items and a integer indicating how many
	 * items fit within a single page
	 */
	public PaginationHelper(List<I> collection, int itemsPerPage) {
	
		this.collection = collection;
		this.itemsPerPage = itemsPerPage;

	}

	/**
	 * returns the number of items within the entire collection
	 */
	public int itemCount() {
		if(collection.isEmpty()) {
			return -1;
		}
		return collection.size();

	}

	/**
	 * returns the number of pages
	 */
	public int pageCount() {
		int pagesCount = (collection.size() - 1) / itemsPerPage + 1;
		return pagesCount;

	}

	/**
	 * returns the number of items on the current page. page_index is zero based.
	 * this method should return -1 for pageIndex values that are out of range
	 */
	public int pageItemCount(int pageIndex) {
		pageIndex++;
		int nosOfItems =0;
		int pgCount = pageCount();
		if(pageIndex>pgCount) {
			return -1;
		}
		
		if((pageIndex*itemsPerPage)<=itemCount()) {
			nosOfItems = itemsPerPage;
		}else {
			nosOfItems = itemCount()%itemsPerPage;
		}
		
	//	return (pageIndex*itemsPerPage) - itemCount();
		return nosOfItems;

	}

	/**
	 * determines what page an item is on. Zero based indexes this method should
	 * return -1 for itemIndex values that are out of range
	 */
	public int pageIndex(int itemIndex) {
	//	if (itemIndex=="")
		int pg = 0;
		if(itemIndex>itemCount() || itemIndex<0) {
			return -1;
		}else if(itemIndex<=itemsPerPage) {
			return 0;
		}
		for(int i=1;i<=pageCount();i++) {
			int itemCount = i*itemsPerPage;
			if(itemIndex<=itemCount) {
				pg = i-1;
				break;
			}
		}
		return pg;

	}

}
